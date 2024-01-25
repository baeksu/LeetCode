/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    const words = s.split(" ");
    console.log(words);

    let ans = [];
    for(let i = words.length-1 ; i>=0 ; i--){
        if (words[i] === "") continue;
        ans.push(words[i])
    }
    
    return ans.join(" ");
};