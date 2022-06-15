document.addEventListener("DOMContentLoaded", function(){
    var olObj = document.querySelector("section > article.container > div.content > ol");
    olObj.addEventListener("click", olClickFunc);
    var dpIptObj = document.querySelector("#dpIpt");
    function olClickFunc(event){
        console.log(event);
        dpIptObj.value = '';
    }
});