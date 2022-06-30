// 함수 선언식, 함수 표현식, 선언식 함수, 표현식 함수
// function declaration, function express
// 선언식 함수
console.log(foo());
//f(); // 불가
function foo(){
    console.log('foo');
};
// 표현식 함수
// 함수 할당문을 실행하기 전까지는 함수의 레퍼런스인지 무엇인지 모른다.
const f = function(){
    console.log('f');
};

f();// 가능

if ( f == undefined ){

}

let person = new Person("홍길동", 1540); // 생성자 함수를 객체를 생성하기 위한 생성자 함수로 호출
let person1 = Person("홍길동", 1540); // 함수로 호출

console.log(person);
console.log(person1);

console.log(birth);

// 함수가 실행되기 전에 this 결정 되어야 함.
// 객체.함수() 형태로 실행하면 this는 객체가 된다
// 함수 호출시 this를 명시적으로 전달(정의)하지 않으면 global 객체가 전달됨
function Person(name, birth){
    // this <= {}
    this.name = name;
    this.birth = birth;
    // return this; 생략 가능
}

function zoo(){
    console.log(this.birth);
}

let obj1 = {birth:1504, f: zoo};
let obj2 = {birth:1999, f: zoo};
obj1.f();
obj2.f();