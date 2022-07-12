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
});
// $(document).ready(function(){
// });