// global을 더럽히지 않기 위해서
(function(){
	var request = new XMLHttpRequest();
	request.onreadystatechange = function(){
		if ( request.readyState === 4 ){
			console.log(request.responseText);
		}
	};
	request.open("GET", "GsonServlet");
	document.querySelector("#fruitBtn").addEventListener("click", function(){
		request.send();
	});
})();