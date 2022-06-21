(function(global){
    function counterFunc(incrementId, decrementId, dpId){
        var incrementObj = document.querySelector(`#${incrementId}`);
        var decrementObj = document.querySelector(`#${decrementId}`);
        var dpObj = document.querySelector(`#${dpId}`);
        var counter = 0;

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
    counterFunc('increaseBtn', 'decreaseBtn', 'dpTxt');
});