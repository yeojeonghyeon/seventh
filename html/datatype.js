// primitive type, reference type
// primitive type : number, boolean, string, null, undefined, symbol
// reference type : {}, function, array 
"use strict"

var num = 1;
var obj = {name: "홍길동", score: 100};
// 레퍼렌스 타입은(객체) 동적으로 프로퍼티를 추가 할 수 있다.
//num.property = 1; // x
obj.property = 1; // o

var ref = obj;

ref.name = "임꺽정";

console.log(obj.name, ref.name);
console.log(obj);

var json = {results: [{name: "황조롱이", livingPlace: "육지"}
                     ,{name: "참새", livingPlace: "육지"}
                     ,{name: "갈매기", livingPlace: "바다"}]};
// json이 참조하고 있는 객체의 프로퍼티 results 배열의 첫번째 요소의 값을 할당
// 아주아주 많이 보이는 문법                     
var firstBirdObj = json.results[0];

var json2 = {info: {version: "1.0", author: "our company"}};
console.log(json2.info.version);

function foo(){
    return [{version: 1.2}, 2, 3, 4];
}
// 자주 보이는 문법
var version = foo()[0].version;
console.log(version);

// 식별자(변수, 함수)의 scope, 범위
// var : function scoped
// let, const : block scoped

// parameter type이 없음...
// 이 함수의 외부 함수는 global 함수
function method(x, y){
    var temp = x + y;
    console.log(version); // 당연히 ok!!!!!
    return temp;
}

var result = method(1, 2);

//
var counter = 0 ;

function increment(){
    return ++counter;
}
function decrement(){
    return --counter;
}
increment();
increment();
increment();
decrement();
decrement();
decrement();

function outer(x){
    // if x == undefined, then counter = 0 
    var counter = x||0;
    function increment(){
        return ++counter;
    }
    function decrement(){
        return --counter;
    }
    // {increment: increment, decrement: decrement};
    return {increment, decrement};
}

// 84 outer 함수가 실행 되는 과정 중
// outer's E.C
// this
// Lexical Environment ----------- (1)
//  Environment Record {x: 5, counter: 5, increment: {[[scope]]: (1)}, decrement: {[[scope]]: (1)}}
//  Outer Reference
var counter1 = outer(5);
// 92 outer 함수가 실행 되는 과정 중
// outer's E.C
// this
// Lexical Environment ----------- (2)
//  Environment Record {x: 10, counter: 10, increment: {[[scope]]: (2)}, decrement: {[[scope]]: (2)}}
//  Outer Reference
var counter2 = outer(10);

// increment 함수가 실행 되는 중
// outer's E.C
// this
// Lexical Environment ----------- (3)
//  Environment Record {}
//  Outer Reference <= increment.[[scope]]: (1)
counter1.increment();
console.log(counter1.increment());

counter2.increment();
console.log(counter2.increment());

// 함수 객체의 prototype 프로퍼티
// __proto__
// Person.prototype = {constructor: Person, __proto__: Function.prototype}
function Person(name, birth, address){
    this.name = name;
    this.birth = birth;
    this.address = address;
    this.getInfo = function(){
        return `${this.name} ${this.birth} ${this.address}`;
    };
}
// Person.prototype = {constructor: Person, __proto__: Function.prototype, version = 1.0, getVersion: function(){}}
Person.prototype.version = "1.0";
Person.prototype.getVersion = function(){
    return this.version;
};

// 빈 객체를 하나 만들고 {__proto__: Person.prototype} this로 바인딩
var kim = new Person("김사랑", "1976-03-23", "서울특별시 강남구");
// 객체(o).함수() 형태로 호출되면 호출되는 함수의 this는 객체(o)
console.log(kim.getInfo()); //
// kim 객체에는 자신 소유의 getVersion이 없음. 그래서 프로토타입 체인을 따라서 올라감(__proto__: Person.prototype)
// Person.prototype에 getVersion이 존재. getVersion이 함수여서 실행 함.
// 그리고 봤더니 함수 내부에 this가 보이죠. this <= kim : kim.getVersion(), kim 객체에는 자신 소유의 version 프로퍼티가 없음
// 그래서 프로토타입 체인을 따라서 올라감(__proto__: Person.prototype)  
console.log(kim.getVersion()); // 1.0

Person.prototype.version = "1.1";
var kang = new Person("강민수", "1971-03-23", "서울특별시 강남구");
console.log(kang.getVersion());

// Child.prototype = {__proto__: Person.prototype, name: undefined, birth: undefined
//                , address: undefined
//                , getInfo: function
//                , constructor: Child}
Child.prototype = new Person();
Child.prototype.constructor = Child;
function Child(name, birth, address){
    // this.name = name;
    // this.birth = birth;
    // this.address = address;
    // 생성자 빌려쓰기
    // 객체.함수, this  = 객체
    // call, apply, bind 함수를 이용하면 함수의 this를 설정 할 수 있다.
    Person.call(this, name, birth, address);
};
// {__proto__: Child.prototype}
var child = new Child("자식", "1988", "순천시 장천동");
console.log(child.getInfo());
console.log(child.getVersion());
