document.addEventListener("DOMContentLoaded", function(){
    document.querySelector("#firstBtn").addEventListener("click", function(){
        alert(this.innerText);
    });
    document.querySelector("#secondBtn").addEventListener("click", function(){
        alert(this.innerText);
    });
});