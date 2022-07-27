document.querySelector("table.mainTable").addEventListener("click", function(){
	//alert(event.target.innerText);
	var tr = event.target.parentElement;
	var tds = tr.children;
	var tdArr = Array.from(tds);
	var result = tdArr.map(ele=>ele.innerText).join(' ');
	alert(result);
});