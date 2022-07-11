// Object.prototype = {constructor: Object, __proto__: null}
// Arithmetic.prototype = {consturctor: Arithmetic, __proto__: Object.prototype }
function Arithmetic(x, y){
    this.x = x;
    this.y = y;
}
Arithmetic.prototype.add = function(){
    return this.x + this.y;
}
Arithmetic.prototype.subtract = function(){
    return this.x - this.y;
}
// op1.__proto__ <= Arithmetic.prototype
let op1 = new Arithmetic(1, 2);
let op2 = new Arithmetic(2, 3);

console.log(op1.add());
console.log(op2.add());

// Person.prototype
Person.prototype.showInfo = function(){
    console.log(this.userName);
}
function Person(){
    this.getUserName = function(){
        return this.userName;
    };
    this.getBirth = function(){
        return this.birth;
    };
}
function Student(userName, birth){
    // this.__proto__ <= Student.prototype
    this.userName = userName;
    this.birth = birth;
}
Student.prototype = new Person();
Student.prototype.constructor = Student;
// Student.prototype = {constructor: Student, getUserName, getBirth, __proto__: Person.prototype}
// s.__proto__ <= Student.prototype
let s = new Student("홍길동", 1540);

s.showInfo();