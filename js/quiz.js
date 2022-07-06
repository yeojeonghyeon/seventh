(function(){
    var funcArr = [];
    for(var i=0; i<10; i++){
        funcArr[i] = function(){ // [[scope]] <= 무기명 EC
            return i;
        };
    }
    // i = 10
    for(var funRef of funcArr){
        console.log(funRef());
    }
})();