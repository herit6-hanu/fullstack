//whenever we are working with the object then go for for in loop

var obj ={
    name:"hanumantha reddy",
    age:24,
    profession:"IT Engineer",
    company:"Cigniti Technologies",
    marriage:false==true?"not married":"married"
}

for(let data in obj){
    console.log(obj[data]);
}