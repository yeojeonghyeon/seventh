(function(){
    try{
        foo();
    }catch(ex){
        console.log(ex);
    }finally{
        console.log('finally');
    }
})();

(function(){
    "use strict"
    try{
        var obj = 1;
        obj.name = "홍길동";
    }catch(e){
        console.log(e);
    }
})();

(function(){
    // 객체는 프로퍼티 할당문을 만나면, 만약에 해당 프로퍼티가 없으면 동적으로 생성.
    let obj = {};
    obj.age = 1;
    obj.name = "홍길동";
    console.log(obj);
})();