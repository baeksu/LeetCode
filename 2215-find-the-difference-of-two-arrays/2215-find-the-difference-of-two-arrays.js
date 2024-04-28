/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[][]}
 */
var findDifference = function(nums1, nums2) {
    
    const answer1 = [];
    const answer2 = [];
    
    const numHashMap1 = {};
    const numHashMap2 = {};
    
    for(let i = 0 ; i< nums1.length ; i++){
        numHashMap1[nums1[i]] = 1;
    }

    for(let i = 0 ; i< nums2.length ; i++){
        numHashMap2[nums2[i]] = 1;
    }
    
    for(let key in numHashMap1){
        if(key in numHashMap2){
            delete numHashMap2[key];
            continue;
        }
        answer1.push(key)
    }

    for(let key in numHashMap2){
        answer2.push(key)
    }
    return [answer1, answer2]
    
};