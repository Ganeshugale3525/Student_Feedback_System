let subvalidate = (str) => {
	//let reg=/^[a-zA-Z ]+$/
	alert(str);
	var span = document.getElementById("s");
	if (str.match(/^[a-zA-Z ]+$/) == null) {
		span.innerHTML = "Invalid Book Name";
		span.style.color = "red";
	}

	else {
		span.innerHTML = "";
		SubjectExist(str);
		span.style.color = "red";
	}
}




let SubjectExist = (str) => {
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			document.getElementById("s").innerHTML = this.responseText;

		}
	};
	xhttp.open("GET", "chacks?subname=" + str, true);
	xhttp.send();
}



let SubjectSearch = (name) => {

	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			document.getElementById("p").innerHTML = this.responseText;
		}
	};
	xhttp.open("GET", "ser?subname=" + name, true);
	xhttp.send();
}




let addqul = () => {
	var FN = document.createElement("input");
	FN.setAttribute("type", "text");
	FN.setAttribute("name", "file");
	FN.setAttribute("placeholder", "EnterQualification");
	FN.style.accentColor = "red";
	var innerDiv = document.getElementById("s1");
	innerDiv.append(FN);

	var s = document.createElement("input");
	s.setAttribute("type", "Submit");
	s.setAttribute("value", "AddQualification");
	
	s.style.accentColor = "red";
	var innerDiv = document.getElementById("sd");
	innerDiv.append(s);
}
