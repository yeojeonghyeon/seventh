(function(){
    if ( "" ) console.log("empty string");
    if ( 0 ) console.log("0");
    if ( undefined ) console.log("undefined");
    if ( null ) console.log("null");

    if ( 1234 ) console.log(1234);
    if ( {} ) console.log("{}");

    outerLoop:
    for(var i=0; i<10; i++){
        for(var j=0; j<10; j++){
            console.log(i, j);
            if ( i == 5 ) break outerLoop;
        }
    }

    var person = {
        firstName:"John",
        lastName:"Doe",
        age:50,
        eyeColor:"blue"
    };
    for(let eachVar in person){
        console.log(eachVar, person[eachVar]);
    }

})();