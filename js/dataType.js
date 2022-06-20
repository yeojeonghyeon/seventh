// 즉시 실행 함수, IIFE(Immediately Invoked Function Expression)
// 함수의 선언과 동시에 실행
// 
var gNum = 1;
(function(){
    console.log(gNum);
})();
gNum = 2;

foo();

function foo(){
    console.log(gNum);
}

(function(){
    var isNameChecked = true;
    var isAgeChecked = false;
    console.log(isNameChecked);
    console.log(isAgeChecked);
    var x=1;
    var y=2;
    console.log(x>y);
    console.log(4>1);
    if ( isNamChecked ){
      console.log("isNamChecked");
    }
    // 내부 함수는 자신을 포함하는(선언적으로) 외부 함수(외부 환경)의 식별자 정보를 사용 할 수 있다(access)
    // 함수는 reference type(참조형), 일급객체
    function zoo(){
        if ( isNameChecked ) return true;
        else return false;
    }
})();