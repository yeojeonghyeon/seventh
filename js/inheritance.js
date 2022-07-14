(function(){
    var Person = (function(){
        function Person(name){
            // this.__proto__ <= Person.prototype
            this._name = name;
            // return this;
        }
        Person.prototype.sayHi = function(){
            console.log(`Hi! ${this._name}`);
        };
        // Object.prototype = {conturctor: Object, __proto__: null}
        // Person.prototype = {contructor: Person, __proto__: Object.prototype, sayHi: function(){.....}}
        return Person;
    })();

    // p1.__proto__ <= Person.prototype
    // p2.__proto__ <= Person.prototype
    let p1 = new Person("홍길동");
    // p1 = {__proto__: Person.prototype, _name: "홍길동"}
    let p2 = new Person("임꺽정");
    // p2 = { __proto__: Person.prototype, _name: "임꺽정"}

    p1.sayHi();
    p2.sayHi();

    // es6 class만 존재, 인터페이스 x
    class Student {
        constructor(name, grade){
            this._name = name;
            this._grade = grade;
        }
        sayHi(){
            console.log(`name: ${this._name}, grade: ${this._grade}`);
        }
        getInfo(){
            return this._getInfo();
        }
        _getInfo(){
            return `name: ${this._name}, grade: ${this._grade}`;
        }
    }
    // stu <= Student 클래스의 인스턴스(객체), "윤석열", "president"
    let stu = new Student('윤석열', 'president');
    stu.sayHi();
    let result = stu.getInfo();
    console.log(result);

    class Foo{
        constructor(arr = []){
            this._arr = arr;
        }
        
        get firstElement(){
            return this._arr.length ? this._arr[0] : null;
        }
        set firstElement(element){
            this._arr = [element, ...this._arr];
        }
    }
    let foo = new Foo(["a", "b"]);
    // set으로 설정된 함수는 할당문을 만나면 동작된다
    foo.firstElement = 'c';
    console.log(foo.firstElement); // 
    foo.firstElement = 'd';
    console.log(foo.firstElement); // 
})();