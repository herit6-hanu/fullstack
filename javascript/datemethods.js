var todayDate = new Date();

console.log(todayDate);
console.log(todayDate.getMonth());
console.log(todayDate.getDate());
console.log(todayDate.getDay());
console.log(todayDate.getHours());
console.log(todayDate.getMinutes());
console.log(todayDate.getSeconds());
console.log(todayDate.getMilliseconds());
console.log(todayDate.getTime()/1000);

console.log(todayDate.toString());//return date and time in string format
console.log(todayDate.toDateString());//return date in string format
console.log(todayDate.toTimeString()); //return time in string format

console.log(todayDate.toISOString());

console.log(todayDate.toLocaleDateString());

//now i am going to use the set methods

var date = new Date();
date.setFullYear(2023)
console.log(date);
date.setMonth(5)
console.log(date);
date.setDate(25);
console.log(date);
date.setHours(10);
console.log(date);
var date = new Date();
debugger
date.setTime(1709840550*1000);
console.log(date);