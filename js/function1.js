// global, 함수의 영역이라고 간주
// 자바로 생각하면 main 함수
// var, function scoped
// let, const, block scoped, 선언하고 접근(사용)해야 함
let bar = 1;
let foo = 2;

if ( true ){
    bar = bar + 1;    
}

for(let i=0; i<100; i++){
    foo = foo + i;
}

console.log(bar, foo);

// 자바스크립트의 함수는 first-class object 1급 객체
// 변수에 할당 할 수 있고, 함수의 인자값으로 전달 할 수 있고
// 함수의 반환값으로 사용 할 수 있다.

const f = function(x, y){
    return x+y;
};

function operator(x, y, func){
    return func(x, y);
}
// bar 2, foo 4952
let result;
result = operator(bar, foo, f);
console.log(result);
result = operator(bar, foo, (x, y)=>x-y);
console.log(result);
result = operator(bar, foo, function(x, y){
    return x*y;
});
console.log(result);

function counter(){
    let accum = 0;
    function increment(){
        return accum++;
    }
    function decrement(){
        return accum--;
    }
    //return {inc:increment, dec:decrement};
    //return {increment:increment, increment:decrement};
    return {increment, decrement};
}

const c1 = counter();
const c2 = counter();