// execution context
// E.C
// 함수가 실행되기 전엔 함수의 실행과 관련된 정보들의 집합체.
// this value
// Lexical Environment
//  -. Environment Record
//     식별자 정보
//  -. Outer Refer
//     외부 환경의 식별자 정보를 가진 객체의 레퍼런스(Lexical Environment)
// Variable Environment
// 아무것도 아닌 코드지만
// 문맥을 읽어 낼 수 있으면 따봉!
function outer(){
    let score = 0;
    function inner(){
        let temp = 0;
        return function(){
            score++;
            temp++;
            return {temp, score};
        }
    }
    return inner;
}

let inner = outer();
let f = inner();
console.log(f());
console.log(f());
console.log(f());
console.log(f());

let inner2 = outer();
let ff = inner2();
console.log(ff());
console.log(ff());
