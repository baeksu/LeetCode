/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {
    for(const i in obj){
         console.log(i)
         return false;
    }
    return true;
};