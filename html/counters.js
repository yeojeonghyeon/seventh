(function(global){
    // closure
    // 외부 함수 내부 함수 관계에서 나타나는 현상
    // 내부 함수가 외부 함수의 식별자를 사용하고
    // 내부 함수의 레퍼런스(참조)가 살아 있을 경우(누군가로 부터 참조 되고 있을 경우)
    // 내부 함수를 평가 했을 때 실행 되었던 외부 함수의 식별자 정보가 사라지지 않는 현상
    function counterFunc(incrementId, decrementId, dpId){
        var incrementObj = document.querySelector(`#${incrementId}`);
        var decrementObj = document.querySelector(`#${decrementId}`);
        var dpObj = document.querySelector(`#${dpId}`);
        var counter = 0;
        dpObj.value = 0;

        incrementObj.addEventListener("click", clickHandler);
        decrementObj.addEventListener("click", clickHandler);

        function clickHandler(){
            if ( this.id == incrementId ){
                dpObj.value = ++counter;
            }else if( this.id == decrementId ){
                dpObj.value = --counter;
            }
        }
    }
    // counterFunc 프로퍼티가 새로 생김, 그 값은 counterFunc 함수의 래퍼런스
    global.counterFunc = counterFunc;
})(window);

document.addEventListener("DOMContentLoaded", function(){
    // E.C -- 1
    // incrementObj : +버튼의 DOM(Tag를 javascript에서 참조 할 수 있도록 만들어 놓은 객체) 객체
    //                 incrementId에 해당하는 DOM, increaseBtn
    // decrementObj : -버튼의 DOM, decrementId DOM, decreaseBtn
    // dpObj : 값을 표시하는 input tag의 DOM, dpTxt
    // counter : 0, number
    // clickHandler.[[scope]] = E.C -- 1
    counterFunc('increaseBtn', 'decreaseBtn', 'dpTxt');
    // E.C -- 2
    // incrementObj : +버튼의 DOM(Tag를 javascript에서 참조 할 수 있도록 만들어 놓은 객체) 객체
    //                 incrementId에 해당하는 DOM, addBtn
    // decrementObj : -버튼의 DOM, decrementId DOM, subtractBtn
    // dpObj : 값을 표시하는 input tag의 DOM, disp
    // counter : 0, number
    // clickHandler.[[scope]] = E.C -- 2
    counterFunc('addBtn', 'subtractBtn', 'disp');
});