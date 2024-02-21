"use strict"
//object in js in the form of key & values
var person ={
    myname:"Hanu",
    profession:"software",
    age:24,
    company:"cigniti",
    isSingle:true,
    gender:"Male"
}

console.log(typeof person);

//access values

console.log(person.gender);
var values=Object.values(person)
console.log(typeof values);