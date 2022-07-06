// primitive type 제외하곤 object ( Reference type )
var n = 1; // number type
var s = '문자열'; // "" `` string
var tl = `템블릿 리터럴 ${s}`;
var nullType = null; // null
var ud = undefined; // undefined
var b = true; // boolean

var objectLiteral = {productName: "상품", price: 1000}; // object literal
var objConstructor = new Object();
var arrayLiteral = []; // 배열
// 선언식 함수, 함수 선언식 ( function declaration )
// 함수 객체
// first-class object 일급 객체
// 변수에 할당 할 수 있고, 함수의 인자로 전달 할 수 있고, 함수의 리턴값으로 사용 될 수 있다.
function foo(f){
    return function(){
        return ++f;
    };
}
foo.usage = `I'm a foo`;

var funcRef = foo; // 함수의 레퍼런스를 변수 funcRef에 할당

funcRef(); // foo 함수가 실행

function operator(x, y, func){
    return func(x, y);
}

var result = operator(1, 2, function(x, y){
     return x+y; 
});

result = operator(1, 2, function(x, y){
    return x*y; 
});

function producer(){
    var x = 1;
    return ++x;
}

console.log(producer()); // 1 output 1, 2
console.log(producer()); // 2 output 1, 2

var x = 1;
function useGlobalVar(){
    return ++x;
}

console.log(useGlobalVar()); // 2
console.log(useGlobalVar()); // 3

function counter(){
    var x = 0;
    function increment(){
        return ++x;
    }
    return increment;
}

var incRef = counter(); // increment.[[scope]] (1) <= 현재 실행되고 있는 counter 함수의 EC(execution context, 식별자 정보, outer reference)
var incRef2 = counter(); // increment.[[scope]] (2) <= 현재 실행되고 있는 counter 함수의 EC(execution context, 식별자 정보, outer reference)
var incRef3 = incRef;
console.log(incRef()); // 1 현재 실행되는 increment's EC's outer reference <= (1)
console.log(incRef()); // 2 현재 실행되는 increment's EC's outer reference <= (1)
console.log(incRef3()); // 3 현재 실행되는 increment's EC's outer reference <= (1) 

console.log(incRef2()); // 1 현재 실행되는 increment's EC's outer reference <= (2)
console.log(incRef2()); // 2 현재 실행되는 increment's EC's outer reference <= (2)
