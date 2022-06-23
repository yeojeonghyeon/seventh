const express = require('express');
const app = express();
const port = 3000;

//
app.use(express.json());
app.use(express.urlencoded({extended:true}));

// 함수, 람다(lambda) 함수
// ()=>{}
app.get('/', (req, res)=>{
    res.sendFile(__dirname + '/form.html');
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

app.listen(port, ()=>{
    console.log(`simple-server app listening on port ${port}`);
});