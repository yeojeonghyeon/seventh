document.addEventListener("DOMContentLoaded", function(){
    var iptObj = document.querySelector("#dpIpt");
    document.querySelector("#firstBtn").addEventListener("click", function(){
        iptObj.value = this.innerText;
    });
    document.querySelector("#secondBtn").addEventListener("click", function(){
        iptObj.value = this.innerText;
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