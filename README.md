# flying-saucer-pdf-demo について

flying sauce ライブラリを使って、HTML から PDF に変換するライブラリを使ったアプリのデモです。
HTML は Mustache のテンプレートを用意しておき、Mustache の実装ライブラリの Handlebars でデータを適用しています。


### ディレクトリと構成
```
src/main
+- java/
   +- com.futsalud.flyingsaucerpdfdemo.Demo1App ・・・ デモコード
+- resources/
   +- fonts  ・・・ フォントを格納します。IPA フォントを入手し格納してください(ipamp.ttf ipagp.ttf が必要です)
   +- template
      +- demo1.hbs ・・・ HTML のテンプレートです。 (mustacheです)

src/teest/java/
+- com.futsalud.flyingsaucerpdfdemo.Demo1App ・・・ テストコード（何もテストしていません）
```

### IPA フォントの入手
以下より入手してください。
https://ipafont.ipa.go.jp/old/ipafont/download.html

↓を入手して、解凍されたフォントファイルを resources/fonts 配下に格納してください。

格納例
```bash
$ ls -1
IPA_Font_License_Agreement_v1.0.txt
Readme_IPAfont00303.txt
ipag.ttf
ipagp.ttf
ipam.ttf
ipamp.ttf

```

### リポジトリ
https://github.com/extra-wasabi-jp/flying-saucer-pdf-demo.git
