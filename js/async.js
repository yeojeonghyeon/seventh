async function f(){
    return 1;
}

var result = f();

// async 함수가 리턴을 하고, 리턴된 결과를 받아서 특별한 로직을 수행해야 한다면
// async 함수가 리턴한 Promise 객체에 then 함수를 통해서 처리
async function useAwait(){
    let promise = new Promise((resolve, reject)=>{
        setTimeout(()=>{
            resolve(100);
        }, 2000);
    });
    let result = await promise; // 대기상태
    return result;
}

// 일반 함수라면 반환 할 때 까지 대기
// async 함수는 Promise 생성자를 사용한 객체를 리턴
useAwait().then((result)=>{
    console.log(result);
});
console.log("useAwait not finish");