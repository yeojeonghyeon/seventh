(function(){
    let animalObj = {species: "고양잇과", foodType: "육식동물"};
    animalObj.isFlyable = false;
    animalObj.showInfo = function(){};// property가 함수의 레퍼런스를 담고 있으면 method라 지칭
    let personObj = new Object();
    let animalObj2 = Object.create(animalObj);

    console.log(animalObj, animalObj2);
    if ( animalObj === animalObj2 ) console.log('same obj');

    console.log(animalObj2.species);
    console.log(animalObj2.foodType);
    console.log(animalObj2.bloodType);
})();