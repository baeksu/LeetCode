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
        
        if(cnt){
            ans = ans + (prev*cnt);
            prev = cnt;
        }

    })
    
    return ans;
};