/**
 * @param {number} num
 * @return {number}
 */
var maximum69Number  = function(num) {
    //제일 상위부터 보면서 6인 값을 9로 바꾸면 될듯?
    let strNum = num.toString();
    for(let i = 0 ; i< strNum.length ; i++){
        if(strNum[i] === '6'){
            let chars = strNum.split('');
            chars[i] = '9';
            strNum = chars.join('');
            break;
        }
    }
    return parseInt(strNum);
};