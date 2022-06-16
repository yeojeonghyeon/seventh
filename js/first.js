// 글로벌 스코프 영역
// 글로벌 지역변수 
// gVariable, y, result
// 함수 식별자 add, outer
var gVariable = 1;
var y = 7;

var result = add(gVariable, y);

console.log(result);

outer();
// 같은 스코프(영역) 안에서 선언된 함수는 선언 위치(위, 아래)
// 관계 없이 해당 영역(스코프)에서 접근 가능 
function add(x, y){
    // 함수 스코프 (영역)
    return x+y;
}
// 선언적으로 함수 내부에서 선언된 함수를 내부 함수라고 하고
// 내부 함수 블럭에서 외부 함수의 식별자(변수, 함수)를 접근 할 수 있다.
function outer(){
    // 지역변수 y
    // 함수식별 inner, foo
    var y = 1;
    inner();
    function inner(){
        var x = 2;
        console.log(y);
    }
    function foo(){
        console.log(y);
    }
}