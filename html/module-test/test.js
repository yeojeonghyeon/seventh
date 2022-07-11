let arr = [1,2,3,4,5];
function funcInTest(){
    return 'funcInTest';
}

export default function(){
    return 'default function';
}

// import 해서 사용 가능
// 외부로 노출할 녀석들만 기술
export {arr, funcInTest};