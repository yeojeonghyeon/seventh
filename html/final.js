document.addEventListener("DOMContentLoaded", function(){
    var firstObj = document.querySelector("#firstOperand");
    var secondObj = document.querySelector("#secondOperand");
    var resultObj = document.querySelector("#resultIpt");
    document.querySelector("#addBtn").addEventListener("click", function(){
        var result = Number(firstObj.value) + Number(secondObj.value);
        resultObj.value = result;
    });
    document.querySelector("#subtractBtn").addEventListener("click", function(){
        var result = parseInt(firstObj.value) - parseInt(secondObj.value);
        resultObj.value = result;
    });
    document.querySelector("#multiplyBtn").addEventListener("click", function(){
        var result = parseFloat(firstObj.value) * parseFloat(secondObj.value);
        resultObj.value = result;
    });
    document.querySelector("#divideBtn").addEventListener("click", function(){
        var result = parseFloat(firstObj.value) / parseFloat(secondObj.value);
        resultObj.value = result;
    });
});