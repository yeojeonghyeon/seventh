(function(){
    let buttons = document.querySelectorAll("div.container > button");

    // block scoped
    // 식별자 i가 for문이 실행 되는 횟수 만큼 생성
    // 블록 별로 식별자 정보를 기록하는 e.c 생성 되었고, 그녀석들이
    // 내부 함수를 통해서 유지 되는 현상
    for(let i=1; i<= buttons.length; i++){
        let buttonDom = buttons[i-1];
        buttonDom.addEventListener("click", function(){
            alert(i);
        });
    }

    // var index = 1;
    // for(let buttonDom of buttons){
    //     buttonDom.addEventListener("click", (function(index){
    //         return function(){
    //             alert(index);
    //         };
    //     })(index));
    //     index++;
    // }
})();