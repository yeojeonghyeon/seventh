(function(global){
    function swapModule(leftSelId, rightSelId, leftBtnId, rightBtnId, lItems, rItems){
        var leftSelObj = document.getElementById(leftSelId);
        var rightSelObj = document.getElementById(rightSelId);
        var leftBtnObj = document.getElementById(leftBtnId);
        var rightBtnObj = document.getElementById(rightBtnId);
        buildItems(leftSelObj, rightSelObj, lItems, rItems);

        leftBtnObj.addEventListener("click", eventHandler);
        rightBtnObj.addEventListener("click", eventHandler);

        function eventHandler(){
            if ( this.id == leftBtnId ){
                moveItems(rightSelObj, leftSelObj);
            }else{
                moveItems(leftSelObj, rightSelObj);
            }
        }
        function moveItems(src, target){
            var options = Array.from(src.options).filter( element => element.selected );

            for(var element of options){
                target.appendChild(src.removeChild(element));
            }
        }
        // function moveItems(src, target){
        //     var options = src.options;
        //     var removedItems = [];
        //     for(var i=options.length-1; i>=0; i--){
        //         if ( options[i].selected ){
        //             removedItems.push(src.removeChild(options[i]));
        //         }
        //     }
        //     for(var element of removedItems){
        //         target.appendChild(element);
        //     }
        // }
    }

    function buildItems(leftSelObj, rightSelObj, lItems, rItems){
        for(var item of lItems){
            var addedOption = document.createElement("option");
            addedOption.value = addedOption.innerText = item;
            leftSelObj.appendChild(addedOption);
        }
        for(var item of rItems){
            var addedOption = document.createElement("option");
            addedOption.value = addedOption.innerText = item;
            rightSelObj.appendChild(addedOption);
        }                    
    }
    global.swapModule = swapModule;
})(window);

(function(){
    var lItems = ["tea", "coffee", "milk tea"];
    var rItems = ["aa", "bb", "cc"];
    swapModule("leftSel", "rightSel", "toLeftBtn", "toRightBtn", lItems, rItems);
})();