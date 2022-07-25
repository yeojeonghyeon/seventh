function getData(){
    return new Promise((resolve, reject)=>{
        setTimeout(()=>resolve(1000), 2000);
    });
}

async function foo(){
    let promise = await getData();
    console.log(promise);
    let what = await 1;
    console.log(what);
}

function get(){
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            resolve(1);
        }, 1000);
    });
}

get().then(()=>{
    throw 'error111';
}, (e)=>{
}).catch((e)=>{
    console.log(e);
});