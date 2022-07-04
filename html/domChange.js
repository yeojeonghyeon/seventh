(function(){
    document.querySelector("#changeBtn").addEventListener("click", function(){
        let srcUlObj = document.querySelector("div.srcDiv > ul");
        let srcNodes = [];
        let targetUlObj = document.querySelector("div.targetDiv > ul");
        let targetNodes = [];
        for(let i = srcUlObj.children.length-1; i > -1; i--){
            let liObj = srcUlObj.children[i];
            srcNodes.push(srcUlObj.removeChild(liObj));
        }
        for(let i = targetUlObj.children.length-1; i > -1; i--){
            let liObj = targetUlObj.children[i];
            targetNodes.push(targetUlObj.removeChild(liObj));
        }
        srcNodes.reverse().forEach(node=>targetUlObj.appendChild(node));
        targetNodes.reverse().forEach(node=>srcUlObj.appendChild(node));
    });
})();