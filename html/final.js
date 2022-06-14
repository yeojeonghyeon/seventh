document.addEventListener("DOMContentLoaded", function(){
    var firstObj = document.querySelector("#firstOperand");
    var secondObj = document.querySelector("#secondOperand");
    var resultObj = document.querySelector("#resultIpt");
    document.querySelector("#addBtn").addEventListener("click", function(){
        var result = firstObj.value + secondObj.value;
        resultObj.value = result;
    });
    document.querySelector("#subtractBtn").addEventListener("click", function(){
    });
    document.querySelector("#multiplyBtn").addEventListener("click", function(){
    });
    document.querySelector("#divideBtn").addEventListener("click", function(){
    });
});