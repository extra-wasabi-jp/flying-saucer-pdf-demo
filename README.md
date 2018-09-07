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

### リポジトリ
https://github.com/extra-wasabi-jp/flying-saucer-pdf-demo.git

