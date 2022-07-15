(function(){
    function Animal(name){
        // this <= {} -----------  (2)
        // this.__proto__ <= Animal.prototype's referece
        this._name = name;
        // 생성자 함수로 호출 되었을 경우
        // return 문에 객체를 사용하면(return {}), 사용된 객체가 반환된다
        // 기본형이 return 문에 사용되면 전부 무시되고, this가 반환
        return this; // ---------  (3) 생략 가능
    }
    Animal.prototype.speak = function(){
        console.log(`name : ${this._name}`);
    }
    // 자바스크립트 함수 first-class object (일급객체), 프로퍼티를 가질 수 있음
    // 동적으로 프로퍼티를 추가 할 수 있음
    Animal.convertArray = function(x, y){
        return [x, y];
    }

    let resultArr = Animal.convertArray(1, 2);

    var dog = new Animal("개"); // ----- (1)
    // dog : {_name: '개', __proto__: Animal.prototype}
    // speak 자신을 생성한 생성자 함수의 prototype에 존재
    dog.speak(); // 
})();
(function(){
    // syntactic sugar ; 문법설탕
    class Animal {
        constructor(name){
            this._name = name;
        }
        speak(){
            console.log(`name: ${this._name}`);;
        }
        static convertArray(x, y){
            return [x, y];
        }
    }

    let resultArr = Animal.convertArray(1, 2);
    let cat = new Animal('고양이');

    cat.speak();
})();

(function(){
    class Circle {
        constructor(radius) {
          this.radius = radius; // 반지름
        }
        getDiameter() {
          return 2 * this.radius;
        }
        getPerimeter() {
          return 2 * Math.PI * this.radius;
        }
        getArea() {
          return Math.PI * Math.pow(this.radius, 2);
        }
    }
    class Cylinder extends Circle{
        constructor(radius, height){
            super(radius);
            this.height = height;
        }
        getArea(){
            return (this.height*super.getPerimeter()) * (2*super.getArea());
        }
        getVolume(){
            return super.getArea() * this.height;
        }
        getRadius(){
            return this.radius;
        }
    }
    // 생성자 빌려 쓰기를 통해서, 
    let cylinder = new Cylinder(5, 10);
    console.log(cylinder.getArea());
    console.log(cylinder.getRadius());
})();