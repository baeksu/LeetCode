/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    // if (functions.length === 0 ){
    //     return function(x){return x;};
    // }
        
	return function(x) {
        let res = x;
        for(let i = 0 ; i< functions.length ; i++){
            res = functions[functions.length - i - 1](res);
        }
        return res;
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */