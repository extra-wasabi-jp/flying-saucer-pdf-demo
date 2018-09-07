package com.futsalud.demo.flyingsaucerpdfdemo;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.lowagie.text.pdf.BaseFont;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Slf4j
public class Demo1App {

    @Data
    private class UserInfo {
        private Integer no;
        private String loginId;
        private String userName;
        private String email;

        private UserInfo(Integer no, String loginId, String userName, String email) {
            this.no = no;
            this.loginId = loginId;
            this.userName = userName;
            this.email = email;
        }
    }

    public void execute() {

        String html = "";

        final Map<String, Object> reportData = new LinkedHashMap<>();
        reportData.put("now", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
        reportData.put("userList", Arrays.asList(
                new UserInfo(1, "hideki.matsui", "松井　英樹", "hideki.matsui@hogehoge.dom")
                , new UserInfo(2, "ichirou.suzuki", "鈴木　市郎", "ichirou.suzuki@hogehoge.dom")
                , new UserInfo(3, "keisuki.honda" ,"本多　圭介", "keisuke.honda@hogehoge.dom")
                , new UserInfo(4, "shinji.kagawa","加川　真司", "shinji.kagawa@hogehoge.dom")));

        try {

            // テンプレート適用（mustache）
            log.debug("userList={}", reportData);
            System.out.println(reportData);
            Handlebars handlebars = new Handlebars();
            Template template = handlebars.compile("template/demo1");
            html = template.apply(reportData);

            log.debug("#### テンプレート適用結果 ここから ####");
            log.debug(html);
            log.debug("#### テンプレート適用結果 ここまで ####");

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        try {
            // PDF生成

            FileOutputStream os = new FileOutputStream("demo1.pdf");
            ITextRenderer renderer = new ITextRenderer();
            renderer.getFontResolver().addFont("fonts/ipamp.ttf", BaseFont.IDENTITY_H, true);
            renderer.getFontResolver().addFont("fonts/ipagp.ttf", BaseFont.IDENTITY_H, true);
            renderer.setDocumentFromString(html);
            renderer.layout();
            renderer.createPDF(os);

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

    }

    public static void main(String... args) {
        Demo1App app = new Demo1App();
        app.execute();
    }

}
