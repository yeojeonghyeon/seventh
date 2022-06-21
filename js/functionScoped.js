// var가 아닌 let, const이용하면 function scoped아님
// var : function scoped
// let, const : block scoped
//              선언문을 실행하지 않고 접근 할 수 없음. 접근(access)하려면 선언 먼저
//              해당 변수가 선언된 block을 벗어나면 접근 불가능
// const : immutable(불변) 변수를 선언, 한번 값을 할당하면 재할당 불가능

(function(){
    function outer(limit){
        let accum = 0;
        return function(){
            if ( accum >= limit ) return -1;
            return accum++;
        }
    }
    const incrementFun = outer(3);
    const incrementFun1 = outer(10);

    while(true){
        let result = incrementFun();
        console.log(result);
        if ( result == -1 ) break;
    }

    while(true){
        let result = incrementFun1();
        console.log(result);
        if ( result == -1 ) break;
    }
})();