// 예외 처리를 어떻게 하는지
// 코드가 실행 되다가 예기치 않은 오류가 발생 했을 때 어떻게 흐름을 제어 할 것인가
// 즉시실행 함수 표현, IIFE(Immediately Invoked Function Expression)

// ******** 특정 함수 내에서 예외가 발생 했을 때 예외처리(try catch)를 하지 않으면
// ******** call stack을 따라서(자신을 호출한 함수) 예외가 전파된다.
(function(){
    function throwFunc(){
        try{
            throw "예외 발생"; // 강제로 예외를 발생 1
        }catch(e){//2
            console.log(e);//3
        }
    }
    // let, const
    // block-scoped, const는 한번 값을 할당하면 재 할당 불가능
    try{
        let x = 1;
        const pi = 3.14;
        //pi = 1.43;
        // 예외가 발생되면 예외처리기의 catch block 이동되고 catch을 실행, catch block 아래 코드를 실행
        throwFunc(); // 1
        console.log('remaining try catch block');
    }catch(e){ // 2
        console.log(e); // 3
    }
    console.log('outside try catch');//4
})();