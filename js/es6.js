// let, const; block scoped, block level scope
(function(){
    // item = 1; // 선언문이 실행되기 전에는 식별자를 사용 할 수가 없다
    let item = {};
    const pi = 3.14;

    item = 1;
    // pi = {}; // 불가, const 선언한 변수는 재할당 불가 
    {
        let blockVar = 1;
    }
    // blockVar += 1; // 블럭의 실행이 종료되면 블록 내부의 식별자들은 사라진다
    // console.log(blockVar);
    let funcArr = [];
    for(var i=0; i<10; i++){
        funcArr.push(function(){
            return i;
        });
    }
    for(var funcRef of funcArr){
        console.log(funcRef());
    }

    let funcBlockArr = [];
    for(let i=0; i<10; i++){
        funcBlockArr.push(function(){
            return i;
        });
    }
    for(let funcRef of funcBlockArr){
        console.log(funcRef());
    }

    let text = `파이 : ${pi} 함수 실행 값 : ${funcRef()}`;
    console.log(text);

    // 선언식 함수, 기명 함수
    function zoo(x, y, operator){
        return operator(x, y);
    }
    let result1 = zoo(1, 2, (x, y)=>x+y);
    let result2 = zoo(3, 4, (x, y)=>{
        return x-y;
    });
    let result3 = zoo(4, 5, (x, y)=>x*y);
    let result4 = zoo(6, 7, (x, y)=>x/y);
    console.log(result1, result2, result3, result4);
    //  ref(); // 표현식 함수는 할당문을 만나기 전에는 뭔지 몰라요,,
    //  ref();
    foo(1, 2, 3, 4, 5, 7);
    // rest parameter
    function foo(x, y, ...params){
        console.log(params);
    }
    // 화살표 함수의 this, 람다 함수의 this
    const lambda = (x, y)=>{
        console.log(this);
        x = x + this.i;
        y = y + this.y;
        return x+y;
    };
    result1 = lambda(1, 2); // calling context, 호출하고 있는 함수의 this
    console.log(result1);

    function useLambda(x){
        // this <= {useLambda, x: 10} ------------------ (1)
        let ld = (x)=>{
            // this <= (1)
            x = x + this.x;
            return x;
        };
        let result = ld(x); // calling context
        console.log(result);
    }
    // 1. new 생성자(), 새로운 객체가 생성되고 새로 생선된 객체가 this에 바인딩
    // 2. 객체.함수 형태로 호출
    // 3. Function.prototype.apply, bind, call 함수를 사용하여 명시적으로 this 전달
    // 람다 함수 calling context, 호출하고 있는 함수의 this
    let obj = {useLambda, x: 10};
    obj.useLambda(10);

    function useRestParameter(x = 1, y = 4, ...parameters){
        console.log(x, y, parameters);
    }
    useRestParameter(1, 2, 3, 4, 5, 6, 7);
    useRestParameter(5);
    useRestParameter();
    // spread 연산자
    let fruitArr = ['apple', 'pear', 'banana', 'mango'];
    let fruitsArr = [...fruitArr, 'pine apple', 'water mellon'];
    let mergedArr = [...fruitArr, ...fruitsArr]; // reactjs, state 기능 사용
    
    let fruitObj = {season: 'Spring', country: 'korea', kind: '구지뽕'};
    let spreadObj = {...fruitObj, price: 1000}; // reactjs, state 기능 사용
    console.log(mergedArr, spreadObj);

    function destructuring({name, score}){
        // name, score ; destructuring 함수의 식별자 ( 파라미터 )
        console.log(name, score);
    }
    destructuring({name: 'smith', score: 100});

    // Enhanced Object property
    // {} == new Object() 두 표현은 같다
    let plainObj = {show: function(){
        return this.score;
    }, score: 150};
    let result = plainObj.show(); // show는 property, 함수의 레퍼런스를 담고 있으면, method
    let showRef = plainObj.show; // 함수 레퍼런스를 showRef 할당
    result = showRef(); // this를 명시적으로 전달하지 않았음, global , browser 환경에서 실행 했으면 window
    let otherObj = {showRef, plainObj}; // {showRef: showRef, plainObj: plainObj} //
    result = otherObj.showRef(); // this <= otherObj
    // new Function(); showRef == show
    // show.__proto__ <= Function.prototype
    let boundShowRef = showRef.bind(plainObj);
    result = boundShowRef(); // 150
    console.log(result);

    let propertyName = 'url';
    // property를 정의하는 자리에 [식별자] 형태로 정의 할 수 있음
    // method, 함수명(){}
    // {show(){}} 객체 내부의 show 함수의 외부 환경은 즉시실행 함수
    let enhancedObjPro = {[propertyName]: `http://localhost:3000`,
                          show(){
                            return this[propertyName];
                          }};
    propertyName = 'age';                    
    result = enhancedObjPro.show(); //  enhancedObjPro['age'],            
    console.log(result);
})();