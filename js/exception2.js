// global
// E.C(Execution context), 함수의 실행과 관련된 정보이 저장 된 곳
// 식별자 a, b, c 정보 수집(global 함수가 실행 되기 전에 함수의 레퍼런스로 설정 됨)
try{
    a();
}catch(e){
    console.log(`global 예외처리기 error : ${e}`);
}

function a(){
    b(); // a 함수는 b가 리턴 하기를 기다림.
    console.log('a');
}
function b(){
    c(); // b 함수는 c가 리턴 하기를 기다림
    console.log('b');
}
function c(){
    throw new UserException("c에서 예외 발생했음.", -1000);
    console.log('c');
}
// 객체 리터럴 {}
// ************ 생성자 함수
// ************ 함수가 new 함수(); 형태로 실행이 되면 내부적으로 빈 객체({})가 생성되고
// ************ 생성된 빈(empty)객체가 this에 바인딩(연결) 됨
function UserException(message, code){
    this.message = message;
    this.code = code;
    this.toString = function(){
        return `code : ${this.code} message: ${this.message}`;
    };
}