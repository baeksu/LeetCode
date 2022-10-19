/**
 * @param {string[]} words
 * @param {number} k
 * @return {string[]}
 */
var topKFrequent = function(words, k) {
    const map = new Map();
    let ans = []
    for(let i = 0 ; i< words.length ; i++){
        if(map.get(words[i]) == undefined){
            map.set(words[i],1);
        }else{
            map.set(words[i],map.get(words[i])+1);
        }
    }
    
    ans=[...map.keys()].sort((a,b)=>{
        if(map.get(a)===map.get(b)){
            return b < a ? 1:-1
        }
        
        return map.get(b)-map.get(a)
    }).slice(0,k)
    
    
    return ans;
    
};