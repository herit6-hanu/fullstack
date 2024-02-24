var arr=[1233,true,function(){
    console.log("This is function inside array")
},"hanumantha reddy"];

console.log(arr.length);

arr2=arr.push("sriman"); //returns the new length of the array
console.log("array before pushing ==>",arr);
console.log("array aftere pushing ==>",arr2);

arr.pop(); //removes the last element in the array

console.log(arr);

arr.unshift("another string"); // adds elements at beginning
console.log(arr);

console.log(arr.shift(),arr); // removes the elements at the beginning

console.log(arr.indexOf(true));

console.log(arr.includes("hanumantha reddy"));

console.log(arr.reverse(),arr);
console.log(arr);
console.log(arr.slice(0,3),arr);
console.log(arr.join(" --- "),arr);

console.log(arr.splice(1,2),arr); //from index 2 it will delete 2 elements

console.log(arr);

arr.splice(1,0,"siva sankar reddy",false,3524.343,"narayana");

console.log(arr);