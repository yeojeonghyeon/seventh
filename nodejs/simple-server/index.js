const express = require('express');
const app = express();
const path = require('path'); // 추가
const userRouter = require('./route');
const port = 3000;

//
app.use(express.json());
app.use(express.urlencoded({extended:true}));
app.use('/node_modules', express.static(path.join(__dirname, '/node_modules'))); // 추가

app.use('/member', userRouter);

// 함수, 람다(lambda) 함수
// ()=>{}
app.get('/', (req, res)=>{
    res.sendFile(__dirname + '/form.html');
});

app.get('/ajax', (req, res)=>{
    res.sendFile(__dirname + '/ajax.html');
});

app.get('/hello', function(req, res){
    res.send("Hello World!!!!!!!!!");
});

app.post('/register', (req, res)=>{
    const {userName, userAddr, sexual, psw} = req.body;
    res.json({userName, userAddr, sexual, psw});
});

app.get('/list', function(req, res){
    const result = {list:["javascript", "java", "database", "spring", "reactjs", "html5"]};
    res.json(result);
});

app.get('/getSingers', function(req, res){
    // http 서비스 요청 방식, get, post
    // put, delete
    // get일 경우 req.query
    // post일 경유 req.body
    // get ; http://localhost:3000/getSingers?name=이승훈&age=15
    // post ; data header
    console.log(req.query);
    let result;
    if (req.query.type == 'singer'){
        result = {result:[{no: 1, name: "BTS", numOfAlbum: 3, company: "하이브"},
                            {no: 2, name: "아이유", numOfAlbum: 5, company: "이담엔터테인먼트"},
                            {no: 3, name: "신승훈", numOfAlbum: 11, company: "도로시컴퍼니"}
                        ]};
    }else if (req.query.type == 'actor'){
        result = {result:[{no: 1, name: "송강호", numOfAlbum: 3, company: "써브라임"},
                            {no: 2, name: "이정재", numOfAlbum: 5, company: "아티스트 컴퍼니"},
                            {no: 3, name: "최민식", numOfAlbum: 11, company: "씨제스엔터테인먼트"}
                        ]};
    }
    res.json(result);
});

app.listen(port, ()=>{
    console.log(`simple-server app listening on port ${port}`);
});