var str="       hanumantha reddy          ";
console.log(str.repeat(3));
console.log(str.charCodeAt(3));
console.log(str.slice(0,10));
console.log(str.slice(-2))
console.log(str.slice(-7,str.length))
console.log(str.replace("h","hu"));
console.log(str.replaceAll("h","hu"));
var trimmed=str.trim()
console.log(trimmed.concat(" is hero"));