/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    s = s.split(" ");
    s = s.map((word)=>word.split("").reverse().join(""));
    return s.join(" ");
    

    
};