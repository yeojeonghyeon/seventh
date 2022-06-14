"use strict"
var gName = 0;

var x = 1, y = 5;

var result = add(x, y);

// 콘솔에 파라미터의 값을 출력 해 주는 함수.
console.log(result);

console.log(x+"+"+y+"="+result);
console.log(x+'+'+y+'='+result);
// best
console.log(`${x}+${y}=${result}`);

function add(x, y){
    return x+y;
}

