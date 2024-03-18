document.getElementById("btn").addEventListener("click",()=>{
    let originalText=document.getElementById("original-textarea").value;
    let changedText=document.getElementById("changed-textarea").value;
    var resultDiv=document.getElementsByClassName("result")[0];
    resultDiv.style.visibility = "visible";
    if(originalText!=="" || changedText!==""){

    }else {
        resultDiv.style.color="red";
        resultDiv.textContent="One of the file is blank! Please enter some text...";
        return;
    }
    if (originalText===changedText) {
        resultDiv.style.color="green";
        resultDiv.textContent="The two files are identical...";
    } else {
        resultDiv.style.color="red";
        resultDiv.textContent="The two files are not identical";
    }
})