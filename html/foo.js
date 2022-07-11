var score = 1;
function foo(){ // [[scope]] <= global Execution Context
    return ++score;
}

// foo.js 먼저 실행 된 다음에 bar.js가 실행이 됨.
// bar.js 파일 안에 있는 식별자 정보를 사용 할 수 없음.
alert(zoo());