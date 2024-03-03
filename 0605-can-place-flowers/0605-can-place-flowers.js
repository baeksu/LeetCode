/**
 * @param {number[]} flowerbed
 * @param {number} n
 * @return {boolean}
 */
var canPlaceFlowers = function(flowerbed, n) {
    let ans=0;
    for(let i = 0 ; i< flowerbed.length ; i++){
        if(flowerbed[i] === 1) continue;
        if(checkPrev(flowerbed,i-1) && checkNext(flowerbed,i+1)){
            flowerbed[i] = 1;
            ans++;
        }   
    }
    console.log(ans)
    return ans >= n ? true : false;
};

function checkPrev(flowerbed,index){
    return (index < 0 || flowerbed[index] === 0) ? true : false;
}

function checkNext(flowerbed,index){
    return (index >= flowerbed.length || flowerbed[index] === 0) ? true : false;
}