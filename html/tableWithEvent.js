(function(){
    var searchBtn = document.querySelector("#searchBtn");
    var answerIpt = document.querySelector("#answerIpt");
    var tdList = document.querySelectorAll("table.numberTable > tbody > tr > td");

    searchBtn.addEventListener("click", function(){
        var filteredInputs = Array.from(tdList).filter(ele=>ele.innerText==answerIpt.value);
        for(var tdDom of filteredInputs){
            tdDom.classList.add("bingo");
        }
    });
})();