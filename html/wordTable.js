(function(){
    var searchBtn = document.querySelector("#searchBtn");
    var answerIpt = document.querySelector("#answerIpt");
    var tdList = document.querySelectorAll("table.numberTable > tbody > tr > td");
    
    const bingoClass = "bingo";
    const wordArr = ['click','function','this','document.querySelector','document.getElementById','execution context', 'closure',
    'for of','Immediately Invoked Function Expression','function declaration', 'function expression',
    'const','function-scoped','block-scoped','prototype','function chaining','template literal',
    'backtick','first-class object','lambda','arrow function','primitive type','reference type',
    'Document Object Model','Hello World','console.log','addEventListener'];

    var audio = new Audio(`gunShot.mp3`);
    
    for(var tdDom of tdList){
        tdDom.innerText = wordArr[Math.floor(Math.random()*wordArr.length)];
    }

    searchBtn.addEventListener("click", handler);
    answerIpt.addEventListener("keypress", function(e){
        if ( e.key == "Enter" ){
            e.preventDefault();
            handler();
            this.value = '';
        }
    });

    document.querySelector("#randomBtn").addEventListener("click", function(){
        for(var tdDom of tdList){
            tdDom.innerText = wordArr[Math.floor(Math.random()*wordArr.length)];
        }
    });

    document.querySelector("#initBtn").addEventListener("click", function(){
        for(var tdDom of tdList){
            tdDom.classList.remove(bingoClass);
        }
    });

    // 함수 재사용을 위해서 선언식 함수로 변경
    function handler(){
        var filteredInputs = Array.from(tdList).filter(ele=>ele.innerText==answerIpt.value);
        for(var tdDom of filteredInputs){
            tdDom.classList.add(bingoClass);
            audio.play();
        }
    }
})();