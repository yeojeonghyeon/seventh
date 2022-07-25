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
  
  var concurrentStart = async function() {
    console.log('==CONCURRENT START with await==');
    const slow = resolveAfter2Seconds(); // starts timer immediately
    const fast = resolveAfter1Second();
  
    console.log(await slow);
    console.log(await fast); // waits for slow to finish, even though fast is already done!
  }

 concurrentStart();