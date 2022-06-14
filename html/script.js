document.addEventListener("DOMContentLoaded", function(){
    var iptObj = document.querySelector("#dpIpt");
    document.querySelector("#firstBtn").addEventListener("click", function(){
        iptObj.value = this.innerText;
    });
    document.querySelector("#secondBtn").addEventListener("click", function(){
        iptObj.value = this.innerText;
    });

    // event handler(이벤트 처리기)는 공식적으로 전달되는 파라미터가 하나이다.
    document.querySelector("#thirdBtn").addEventListener("click", function(event){
        console.log(event);
    });
});

(function(){
    function outer(){ // 외부 함수
        var i = 0 ;
        inner();
        alert(i);
        function inner(){ // 내부 함수
            i = i + 1;
        }
    }
    outer();
})();
