// async, await
// 내부적으로 Promise 클래스를 이용해서 ; syntactic sugar
// Prototype을 이용한 상속 => class ; syntactic sugar
function promise(timeout, message){
    return new Promise((resolve, reject)=>{
        // 서비스를 호출하는 하는 코드
        // Restful API 호출
        setTimeout(()=>{
            // 생성자 Promise로 만든 객체의 then 함수의 첫번째 콜백(onfulfilled) 함수를 호출 하는 것
            resolve(`timeout finished, message : ${message}`); 
        }, timeout);
    });
}

var promise1 = promise(1000, '첫번째 프라미스'); // 생성자를 이용해서 객체를 리턴
promise1.then((message)=>{
    console.log(message);
}).catch((e)=>{
    console.log(e);
});

console.log('step 1');

var promise2 = promise(2000, '두번째 프라미스');
promise2.then((message)=>{
    console.log(message);
}).catch((e)=>{
    console.log(e);
});

var promise3 = promise(3000, '세번째 프라미스');
promise3.then((message)=>{
    console.log(message);
    return new Promise((resolve, reject)=>{
        resolve({name:"홍길동", message: message});
    });
}).then((result)=>{
    console.log(result);
});

console.log('step 2');

// call stack 사용하고 있기 때문에
// event loop, 작업큐에 등록된 task이 실행이 될 수 없는 상태
// browswer 환경일 때 single thread
// worker thread, background - 제공
const s = new Date().getSeconds();
while (true) {
    if (new Date().getSeconds() - s >= 4) {
      console.log("좋아요, 2초간 반복했습니다.")
      break;
    }
}
