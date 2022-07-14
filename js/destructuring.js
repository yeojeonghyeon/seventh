// 객체 비구조화, 객체의 프로퍼티의 값을 식별자를 선언하면서 할당
// 배열 비구조화, 배열의 요소 값을 식별자를 선언하면서 할당
let obj = {name: "홍길동", birth: 1504, address: "한양...."};
const {name, birth, address} = {name: "홍길동", birth: 1504, address: "한양...."};
let [a, b, c, d, e] = ['a', 'b', 'c', 'd', 'e'];

[a, b] = [b, a]; // syntactic sugar;

console.log(`a : ${a}, b : ${b}`);

zoo(obj);

function zoo({name, birth}){
    console.log(name, birth);
}

// new Array()
// todos.__proto__ <= Array.prototype
const todos = [
    {id: 1, content: 'HTML5', completed: true},
    {id: 2, content: 'CSS3', completed: true},
    {id: 3, content: 'es5,6', completed: false},
    {id: 4, content: 'jsp/servlet', completed: true}
];
// completed는 배열 객체가 가지고 있는 요소들의 property, completed를 parameter로 사용
// 모던 자바스크립트에서 자주 사용 될 수 있는 문법
const completedSubjects = todos.filter(({completed})=>completed);

const originSubjects = todos.filter((element)=>element.completed);

console.log(completedSubjects, originSubjects);

