var resolveAfter2Seconds = function() {
    console.log("starting slow promise");
    return new Promise(resolve => {
      setTimeout(function() {
        resolve(20);
        console.log("slow promise is done");
      }, 2000);
    });
  };
  
  var resolveAfter1Second = function() {
    console.log("starting fast promise");
    return new Promise(resolve => {
      setTimeout(function() {
        resolve(10);
        console.log("fast promise is done");
      }, 1000);
    });
  };
  
  var sequentialStart = async function() {
    console.log('==SEQUENTIAL START==');
  
    // If the value of the expression following the await operator is not a Promise, it's converted to a resolved Promise.
    const slow = await resolveAfter2Seconds();
    console.log(slow);
  
    const fast = await resolveAfter1Second();
    console.log(fast);
  }

  var concurrentStart = async function() {
    console.log('==CONCURRENT START with await==');
    const slow = resolveAfter2Seconds(); // starts timer immediately
    const fast = resolveAfter1Second();
  
    console.log(await slow);
    console.log(await fast); // waits for slow to finish, even though fast is already done!
  }

 concurrentStart();

//   sequentialStart();

function foo(){
    return 1;
}

test();

async function test(){
    let promise1 = await (function(){
        return new Promise((resolve, reject)=>{
            resolve(1);
        });
    })();
    console.log(`promise1 ${promise1}`);
    let promise2 = await (function(){
        return 1;
    })();
    console.log(`promise2 ${promise2}`);
};


var original = Promise.resolve(33);
console.log(original);
original.then(console.log);
var cast = Promise.resolve(original);
cast.then(function(value) {
  console.log('value: ' + value);
});
console.log('original === cast ? ' + (original === cast));