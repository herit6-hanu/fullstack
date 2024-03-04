var newElement = document.createElement("div");

newElement.innerHTML="<br>This is the new element";
var parentElement=document.getElementsByTagName("p")[0];

parentElement.append(newElement);