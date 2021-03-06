"use strict";
(function(){
    // 생성자 함수로 활용
    // this <= new 생성자() 형태로 호출하면 empty 객체 {}가 생성되고 this 바인딩
    // this.__proto__ <= Animal.prototype 객체의 레퍼런스가 할당
    function Animal(species, livingPlace){
        // falsy value ; 0, null, undefined, nan
        this.species = species||'개과'; // 기본값
        this.livingPlace = livingPlace||'육지'; // 기본값
        this.showInfo = function(){
            // backtick
            console.log(`${this.species} ${this.livingPlace}`);
        };
        this.showInfoUsingClosure = function(){
            console.log(`${species} ${livingPlace}`);
        };
    }
    // {constructor: Animal, __proto__: Object.prototype}
    Animal.prototype.describe = function(){
        console.log(`종은 ${this.species} 사는 곳은 ${this.livingPlace}`);
    };

    // 객체 2개 생성, 변수 이름은 cat, dog
    // var : function scoped, 선언문을 만나지 않아도 사용 가능
    // let, const : block scoped, 선언문이 실행되기 전까지 사용 불가
    // const 재할당 불가
    const cat = new Animal("고양잇과", "육지");
    const dog = new Animal("개과", "마당");

    cat.showInfo(); // 
    dog.showInfo(); // 

    cat.showInfoUsingClosure(); //
    dog.showInfoUsingClosure(); //

    cat.describe();
    dog.describe();

    console.log(cat.__proto__);

    console.log(cat.hasOwnProperty('species')); // true
    console.log(cat.hasOwnProperty('showInfo')); // true 
    console.log(cat.hasOwnProperty('describe')); // false

    for(let sdel in cat){
        // console.log(`${sdel} ${cat[sdel]}`);
        if ( cat.hasOwnProperty(sdel) ){
            console.log(`${sdel} ${cat[sdel]}`);
        } 
    }

    Animal.prototype.describe(); // describe 함수의 this <= Animal.prototype
    cat.desc = Animal.prototype.describe;
    cat.desc(); // describe 함수의 레퍼런스를 담고 있음, 실행되는 함수의 this <= cat

    let funRef = Animal.prototype.describe;
    funRef(); // when use scrict ; this <= undefined
    funRef(); // without use strict ; this <= global, window 객체
})();