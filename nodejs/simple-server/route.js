const expres = require('express');
const router = express.Router();

router.use(function timeLog(req, res, next){
    console.log(`Time: ${Date.now()}`);
    next();
});

router.get('/list', function(req, res){
    const result = {result: [{userName: "홍길동"},{userName: "임꺽정"}]};
    res.json(result);
});

router.post('/register', function(req, res){
    console.log(req.body);
    res.send(req.body);
});

module.exports = router;


