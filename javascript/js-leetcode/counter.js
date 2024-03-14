var createCounter = function(n) {
    
    return function() {
        
        return n++;
    };
};

let create = createCounter(10);
console.log(create());
console.log(create());
console.log(create());