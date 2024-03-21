let returnId = (id) => {
    return document.getElementById(id);
}
console.log("ahfjdkas");
returnId("submit").addEventListener("click", (event) => {
    event.preventDefault();
    let fname = returnId("fname").value;
    let lname = returnId("lname").value;
    if (fname == "") {
        returnId("fname").style.border = "1px solid red";
        return;
    }
    if (lname == "") {
        returnId("lname").style.border = "1px solid red";
        return;
    }
    if (fname != "" && lname != "") {
        var obj = {
        
        };
        obj["first name"] = fname;
    obj["last name"] = lname;
    if (fname != "" && lname != "") {
        localStorage.setItem("data",JSON.stringify(obj));
    }
    }
    console.log(JSON.parse(JSON.stringify(obj)));
    console.log(JSON.parse('{"myName":"hanu"}'));

    
})