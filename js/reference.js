// 객체 literal
// {프로퍼티명 : 값, 프로퍼티명 : 값 ...}
var obj = {name:"홍길동", birth:1504, show:function(){
    return `${this.name} ${this.birth}`;
}};

// 객체의 프로퍼티는 . 연산자, [] 대괄호 표현법에 의해서 접근 할 수 있다.
console.log(obj.name);
console.log(obj['name']);
// 프로퍼티가 함수의 레퍼런스를 참조하면 프로퍼티는 곧 함수로 사용 가능
// 함수가 객체(a).함수() 형태로 호출 될 경우 함수 내부의 this는 객체(a)임.
console.log(obj.show());
console.log(obj['show']());

var x;
console.log(x);

var y = (function(){
    var x = 1, y = 2;
    var result = x + y;
})();

console.log(y);

var z;
z = foo();
console.log(z);
function foo(){}

