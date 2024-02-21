"use strict"
var person=new Object();
person.myname="Hanumantha Reddy";
person.gender="Male";
person.funk=function(){
    return "This is a function in funk key"
}

console.log(person);
console.log(person.funk());

/**
 * 
 * @param {* integer positive/negative integer} x 
 * @param {* integer positive-negative integer} y 
 * @returns sum of integer x & y
 */
function add (x,y){
    return x+y;
}

console.log(add(67,987));

var keys=Object.keys(person);
console.log(keys);