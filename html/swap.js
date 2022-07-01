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
            // collection type을 배열로 변경 후 배열의 요소 중 selected 속성이 true 또는 selected 속성이 있는
            // option  객체들만 걸러낸다
            var options = Array.from(src.options).filter( element => element.selected );

            for(var element of options){
                target.appendChild(src.removeChild(element));
            }
        }
    }

    function buildItems(leftSelObj, rightSelObj, lItems, rItems){
        for(var item of lItems){
            // option tag의 DOM 객체를 생성한다
            var addedOption = document.createElement("option");
            addedOption.value = addedOption.innerText = item;
            // 생성한 option 테그의 DOM 객체를 select의 자식노드(하위)로 배치한다
            leftSelObj.appendChild(addedOption);
        }
        for(var item of rItems){
            var addedOption = document.createElement("option");
            addedOption.value = addedOption.innerText = item;
            rightSelObj.appendChild(addedOption);
        }                    
    }
    // 브라우저 환경의 글로벌일 경우
    // windows 객체에 property를 추가할 경우, 글로벌 변수처럼 접근 할 수 있다.
    global.swapModule = swapModule;
})(window);

(function(){
    var lItems = ["tea", "coffee", "milk tea"];
    var rItems = ["aa", "bb", "cc"];
    swapModule("leftSel", "rightSel", "toLeftBtn", "toRightBtn", lItems, rItems);

    let leftItems = [1, 3, 5, 7, 9];
    let rightItems = [2, 4, 6, 8, 10];
    swapModule("lSelect", "rSelect", "leftBtn", "rightBtn", leftItems, rightItems);
})();