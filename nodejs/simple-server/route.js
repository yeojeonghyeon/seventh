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

// url : http://localhost:3000/member/product
router.get('/product', function(req, res){
    res.sendFile(__dirname + '/product.html');
});
// client fetch 함수를 통해서 호출
// url : http://localhost:3000/member/product/1
let result = {list:[{productId: '1', productName: 'tv', price: 3000000, menufacturer: "삼성"},
                    {productId: '2', productName: '냉장고', price: 5500000, menufacturer: "LG"},
                    {productId: '3', productName: '청소기', price: 1100000, menufacturer: "Dyson"}]};
router.get('/product/:productId', function(req, res){
    // const productId = req.params.productId;
    const { productId } = req.params;
    let productArr = result.list.find((item)=>item.productId==productId);
    res.json(productArr);
});

module.exports = router;


