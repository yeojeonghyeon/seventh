// ECMAScript3, 2009
// 자바스크립트의 변수는 function 스코프 ( 함수 영역 )
// "use strict"
(function(){
    var x = 1;
    // hoisting
    z = 1;
    y = 1;
    console.log(x, y, z);
    if ( true ){
        var r = 1;
    }
    console.log(r);
    // let을 사용해 변수를 선언하면
    // 선언 한 이후부터 사용 가능
    var z;
    //let z;
})();