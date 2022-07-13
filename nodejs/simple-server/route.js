const express = require('express');
const router = express.Router();

router.use(function timeLog(req, res, next){
    console.log(`Time: ${Date.now()}`);
    next();
});

router.get('/list', function(req, res){
    const result = {result: [{userName: "홍길동"},{userName: "임꺽정"}]};
    res.json(result);
});

// closure
const userInfoArr = {list:[]};
router.post('/register', function(req, res){
    console.log(req.body);
    const {name, birth} = req.body; // 객체 비구조화 구문, const name = req.body.name, const birth = req.body.birth
    userInfoArr.list.push({name, birth}); // {name: name, birth: birth}
    res.json(userInfoArr);
});

router.get('/addedList', function(req, res){
    res.json(userInfoArr);
});

module.exports = router;


