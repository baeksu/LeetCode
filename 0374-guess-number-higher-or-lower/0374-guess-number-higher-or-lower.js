/** 
 * Forward declaration of guess API.
 * @param {number} num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * var guess = function(num) {}
 */

/**
 * @param {number} n
 * @return {number}
 */
var guessNumber = function(n) {
    var left = 1;
    var right = n;

    while(left <= right){
        let mid = left + Math.floor((right-left)/2);
        const val = guess(mid);
        if(val === -1){
            right = mid-1;
        }else if(val === 1){
            left = mid+1;
        }else{
            return mid;
        }
    }
    return 0;
};