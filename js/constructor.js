// 생성자 함수

(function(){
    function Person(name, birth){
        this.name = name;
        this.birth = birth;
        this.showInfo = function(){
            return `name : ${this.name}, birth : ${this.birth}`;
        };
    }
    Person.prototype.age = "Person's prototype's age";
    // 인물 3명 추가
    // javascript 배열을 정렬 방법을 구글링, 연도별로 정렬, 출력
    let persons = [new Person("홍길동", 1540), new Person("임꺽정", 1590), new Person("이순신", 1545)
                    , new Person("강감찬", 948), new Person("광개토대왕", 394)];
    // persons.sort((a,b)=>{
    //     if ( a.birth > b.birth ) return 1;
    //     if ( a.birth < b.birth ) return -1;
    //     if ( a.birth == b.birth ) return 0;
    // });

    // Array.prototype.sort
    persons.sort((a,b)=>{
        return a.birth-b.birth;
    });

    // persons.sort((a,b)=>a.birth-b.birth); 축약형

    for(let p of persons){
        console.log(p.showInfo());// showInfo 함수가 반환하는 값을 console.log의 인자로 전달
        console.log(p.age);
    }
})();