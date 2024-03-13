"use strict"
/**
 * 
 * @returns function
 */
var createHelloWorld = function() {
    
    return ()=> {
        return "Hello World";
    }
};

console.log(createHelloWorld()());