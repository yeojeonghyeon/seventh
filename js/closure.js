
// closure
// 내부 함수가 외부 함수의 식별자(변수)를 사용하고, 내부 함수의 레퍼런스가 살아 있을 때(
// 또 다른 코드에서 레퍼런스, 참조 되고 있을 때) 외부 함수의 식별자 정보가 사라지지 않는다
// (유지된다).   

function counter(){
    var x = 0;
    function increment(){
        return ++x;
    }
    function decrement(){
        return --x;
    }
    //return {increment:increment, decrement:decrement};
    return {increment, decrement};
}

var counter1 = counter();
var counter2 = counter();
counter1.increment();
counter1.increment();
counter2.increment();
console.log(counter1.increment());
console.log(counter2.increment());