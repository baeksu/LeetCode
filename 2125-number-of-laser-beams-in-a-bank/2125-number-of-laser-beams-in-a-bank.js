/**
 * @param {string[]} bank
 * @return {number}
 */
var numberOfBeams = function(bank) {
    let ans = 0;
    let prev = 0;
    bank.forEach((str)=>{
        let cnt = 0;
        [...str].forEach((char)=>{
            if(char == 1) cnt++;
        })
        if(cnt!=0 && prev == 0){
            prev = cnt;
        }else if(cnt!=0){
            ans = ans + (prev*cnt);
            prev=cnt;
        }
    })
    
    return ans;
};