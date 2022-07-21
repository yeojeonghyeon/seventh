// async, await
function promise(timeout, message){
    return new Promise((resolve, reject)=>{
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
