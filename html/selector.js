document.addEventListener("DOMContentLoaded", function(){
    var olObj = document.querySelector("section > article.container > div.content > ol");
    olObj.addEventListener("click", olClickFunc);
    var dpIptObj = document.querySelector("#dpIpt");
    function olClickFunc(event){
        // event.target 객체를 이용
        // event.target 프로퍼티는 이벤트가 발생한 tag(요소, 객체)
        dpIptObj.value = event.target.innerText;
    }
});