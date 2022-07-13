const express = require('express');
const app = express();
const path = require('path');
const port = 3000;

//
app.use(express.json());
app.use(express.urlencoded({extended:true}));
app.use('/node_modules', express.static(path.join(__dirname, '/node_modules')));

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
    const result = {signers:[{no: 1, singerName: "BTS", NumOfAlbum: 3, company: "하이브"},
                             {no: 2, singerName: "아이유", NumOfAlbum: 5, company: "이담엔터테인먼트"},
                             {no: 3, singerName: "신승훈", NumOfAlbum: 11, company: "도로시컴퍼니"}
                            ]};
    res.json(result);
});

app.listen(port, ()=>{
    console.log(`simple-server app listening on port ${port}`);
});