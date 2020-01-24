#RestAPIを動かしてみよう！
##事前にインストールするツール 
* Git
* docker toolbox (Macの場合は docker for mac)
* IntelliJ(CommunityEditionでもOK) or eclipse
* Postman
* MySQL Workbench
* ※それぞれのインストール方法の記事を作成してリンクしたい

##dockerコンテナ上にMySQLを導入
* Docker Quick Terminalを立ち上げておく⇒鯨の絵がでたら準備完了
* 以下のコマンドを実行 
* ※コマンド実行はDocker Quick Terminal、コマンドプロンプト、Terminal、git bashあたりであれば実行可能
```
docker run --name test-db -e MYSQL_DATABASE=localdb -e MYSQL_USER=test_user -e MYSQL_PASSWORD=test_password  -e MYSQL_ROOT_PASSWOR
D=root_password -d -p 3306:3306 mysql
```

###mysqlを立ち上げる
TODO 立ち上げコマンドを記述<br>
TODO 自動起動コマンドを記述<br>

##APIサーバを起動
* gradle - pr - Tasks - bootRunを実行
* コンソールログの右側が "……- Start completed."になって入れば起動成功
* 立ち上がらない場合はDocker上のmysqlが立ち上がっていない場合がるので確認する。

##API疎通確認
* PostManを起動
* +Newボタンを押下
* Enter request URLに下記URLを入力してSendボタンを押下
http://localhost:8080/api/book/
* 以下のレスポンスが返ってくれば疎通成功!!
```
[
    {
        "bookId": 1,
        "title": "わかる！Java",
        "price": 3980
    },
    {
        "bookId": 2,
        "title": "MySql入門",
        "price": 2500
    },
    {
        "bookId": 3,
        "title": "Dockerで作る開発環境ガイド",
        "price": 6000
    }
]
```

## データの確認方法
TODO MySql Workbenchの接続方法を記述する。
