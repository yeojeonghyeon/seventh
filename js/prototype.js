"use strict"
var obj = {type:"object", value:"abcd"};
obj.property = 1;
// 생성자 함수 사용
// Object.prototype 객체를 가지고 있다.
// obj1.__proto__([[prototype]]) <= Object.prototpye 객체의 레퍼런스가 할당
var obj1 = new Object();
obj1.type = "object";

var propertyName = 'type';
console.log(obj['type']);
console.log(obj.type);
console.log(obj.propertyName); // 불가
console.log(obj[propertyName]);
//========================================================================

// 생성자
// Foo.prototype = {constructor, __proto__: Object.prototype};
// getAge.__proto__ <= Function.prototype
Foo.prototype.getAge = function(){
    return this.age;
}
// Foo.prototype = {constructor, __proto__, getAge};

function Foo(age){
    this.age = age;
}
// empty {} 빈 객체가 생성되고 this로 바인딩, 함수가 this를 리턴
// foo.__proto__ <= Foo.prototype
var foo = new Foo(12);
// zoo.__proto__ <= Foo.prototype
var zoo = new Foo(15);

// 함수를 호출하면서 this를 명시적으로 전달, (1), (2)
console.log(foo.getAge()); // 객체(a).함수 형태로 호출 되면, 함수 내부의 this는 객체(a)  ------- (1)
console.log(zoo.getAge());
// 함수를 호출하면서 this 명시적으로 전달 
let ref = Foo.prototype.getAge.bind({age: 17}, []);     //  ------- (2)
console.log(ref());
console.log(Foo.prototype.getAge.apply(foo, null));

let result = Foo.prototype.getAge(); // getAge에 전달되는 this는 Foo.prototype 객체
console.log(result);

(function(){
    function Foo(type){
        this.type = type;
        this.lFunc = ()=>{
            return this.type;
        };
    }

    let f = new Foo('lambda');
    let ref = f.lFunc;
    console.log(f.lFunc());
    console.log(ref());
})();
