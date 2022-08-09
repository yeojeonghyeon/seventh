// global을 더럽히지 않기 위해서
(function(){
	var ulObj = document.querySelector("#fruitList");
	document.querySelector("#fruitBtn").addEventListener("click", function(){
		var request = new XMLHttpRequest();
		request.onreadystatechange = function(){
			if ( request.readyState === 4 ){
				// json 형태의 문자열로 부터 자바스크립트 객체로 변환
				const result = JSON.parse(request.responseText);
				if ( typeof result == 'object' ){
					let html = '';
					for(let element of result){
						html += `<li>${element.name} ${element.season}</li>`;
					}
					ulObj.innerHTML = html;
				}
			}
		};
		request.open("GET", "GsonServlet");
		request.send();
	});
})();