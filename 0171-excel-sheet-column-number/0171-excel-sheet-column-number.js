/**
 * @param {string} columnTitle
 * @return {number}
 */
var titleToNumber = function(col) {
    
    let ans = 0;
    for(let i = col.length-1, k = 0 ; i>= 0 ; i--,k++){
        ans += (col[i].charCodeAt(0) - 64)*(26**k);

    }
    return ans;
};