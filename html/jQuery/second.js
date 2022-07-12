// 문서 로딩이 완료 되었을 때 실행 되는 콜백 함수를 등록 한 것
$(function(){
    $("pre.mainContents").hover(function(){
        // this <= DOM 객체
        // DOM => jQuery Wrapping 시킬 때, $(this)
        // this.classList.addClass();
        this.classList.add("mainContentsHover");
        // $(this).addClass("mainContentsHover");
    }, function(){
        this.classList.remove("mainContentsHover");
        // $(this).removeClass("mainContentsHover");
    });

    let $buttons = $("button.contentsBtn"); // jQuery 유사배열 형태로 반환
    let $lis = $("ul.menuItems > li");
    let $targetUl = $("ul.targetItems");
    
    $buttons.first().click(function(){
        let $clonedLis = $lis.clone();
        $targetUl.append($clonedLis);
    });

    let targetUl = document.querySelector("ul.targetItems");
    let lis = document.querySelectorAll("ul.menuItems > li");
    let secondBtn = document.querySelector("button.contentsBtn:nth-child(2)");
    secondBtn.addEventListener("click", function(){
        for(let liObj of lis){
            targetUl.appendChild(liObj.cloneNode(true));
        }
    });
    // $buttons.last().click(function(){
    // });

    $lis.each(function(index, element){
        element.innerText = `${index} ${element.innerText}`;
    });

    let $menuDiv = $(".menuDiv");
    $("#slidingBtn").click(function(){
        $menuDiv.slideToggle();
    });

    // id foodTbl 선택자를 이용해서 jQuery 객체를 반환, DOM 변수에 담자 ; feat. jQuery
    // foodBtn 버튼의 click 이벤트 헨들러 추가
    // find("td.food").removeClass("food").addClass("notFood");
    let $foodTbl = $("#foodTbl");
    $("#foodBtn").click(function(){
        $foodTbl.find("td.food").removeClass("food").addClass("notFood").css({backgroundColor:"yellow"});
    });
});