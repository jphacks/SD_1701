# SHAREDULER

[![Product Name](https://github.com/MRtaishi09/SD_1701/blob/master/SHARADULER.png)](https://www.youtube.com/watch?v=AbEpw5RcD8Q&feature=youtu.be)

## 製品概要
### 待ち合わせ X Tech

### 背景（製品開発のきっかけ、課題等）
    

-思ったよりも移動に時間がかかって遅刻してしまった！  


-まだ来てない人から連絡が返ってこない。寝てるのかな？それとも移動中かな？それだけでも知れたら良いのに！    

今までにそんな思いや経験をしたことはありませんか？   

私たちはこの課題を解決すべくスケジュールアプリの開発に取り組みました！！

### 製品説明（具体的な製品の説明）
待ち合わせのたびにしばしば誰かが遅れ、遅れている人も待っている人も時間を浪費し、さらにはフラストレーションを感じています。   

参加者全員が時間を有効に使い最大限イベントを楽しむには、参加者の遅刻を防ぎ、遅れている人の状況を知らせてくれる見やすくて使いやすいアプリが必要です。   

このスケジュールアプリは目的地への移動時間から出発時刻を自動計算しユーザに通知すること、   
そしてイベントを共有した参加者が目的地に近づいたかどうかを可視化することでそんなニーズに応えます。   


-カレンダーベースのアプリなので個人での普段使いにも。

-イベント作成時に移動手段と目的地を設定し、Google Directions APIを用いることで自宅からの移動時間の自動計算を実現。

-イベントごとに参加者リストを自動生成し、参加者の名前と目的地へ向かっているかどうかを参加者全員へ可視化。



### 特長

#### 1. シンプルでまとまったカレンダーベースのデザイン
ユーザー目線に立ったデザインによって使いやすさを最大限まで高めています。
#### 2. イベント共有にメールやSNSを使用
メールやSNSで手軽に友人にイベントを共有できます。
#### 3. 参加者リスト
参加者の状況を可視化することで待っている人の不安を軽減します。
### 解決出来ること
1. イベントや待ち合わせへの出発時刻の遅れ   


　2.待ち合わせで遅れている人を待っているときの時間の浪費とフラストレーション

### 今後の展望
道路混雑状況・交通機関状況との連携    




## 開発内容・開発技術
### 活用した技術
#### API・データ

* Google Directions API
* Google Places API


#### デバイス
* Android端末


### 独自開発技術（Hack Dayで開発したもの）
#### 2日間に開発した独自の機能・技術
* イベント開始時刻から出発するべき時間を逆算する機能(AlarmService.java)
* イベントの参加者の情報をリストとして可視化する機能(MemberListActivity.java)
