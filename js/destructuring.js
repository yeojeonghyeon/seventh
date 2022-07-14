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