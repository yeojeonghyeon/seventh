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
    $buttons.first().click(function(){
        alert(this.innerText);
    });
    $buttons.last().click(function(){
        alert(this.innerText);
    });

    let $lis = $("ul.menuItems > li");
    $lis.each(function(index, element){
        element.innerText = `${index} ${element.innerText}`;
    });
});
// $(document).ready(function(){
// });