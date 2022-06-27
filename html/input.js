(function(){
    const btnObj = document.querySelector(`form > input[type='button']`);
    btnObj.addEventListener("click", function(){
        alert(this.value);
    });
})();