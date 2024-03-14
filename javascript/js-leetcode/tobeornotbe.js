var expect = function (val) {
    return {
        toBe: function (val2) {
            if (val===val2) {
                return "true";
            } else {
                return "Not Equal";
            }
        },
        notToBe: function (val2) {
            if (val!==val2) {
                return "true";
            } else {
                return "Equal";
            }
        }
        
    }
};

console.log(expect(5).toBe(5));
console.log(expect(5).notToBe(5));