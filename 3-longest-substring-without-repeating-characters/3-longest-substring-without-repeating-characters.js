/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let left=0;
    let map = new Map();
    let ans = 0;
    
    for(let i = 0 ; i < s.length ; i++){
        let ch = s[i];
        
        if(map.get(ch) >= left){
            left = map.get(ch)+1;
        }
        map.set(ch,i);
        if(i-left+1>ans){
            ans = i-left+1
        }
    }
    return ans;
};
