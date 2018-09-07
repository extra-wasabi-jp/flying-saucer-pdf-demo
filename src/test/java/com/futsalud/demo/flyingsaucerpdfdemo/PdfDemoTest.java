package com.futsalud.demo.flyingsaucerpdfdemo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

@Slf4j
public class PdfDemoTest {

    @Test
    public void test_demo1() {
        log.debug("start");

        Demo1App demoApp = new Demo1App();
        demoApp.execute();

        assertThat(0, is(0));
        log.debug("end");
    }

}
