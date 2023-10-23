function solution(t, p) {
    var answer = 0;
    
    let pSize = p.length;
    
    for(let i = 0 ; i<= t.length - pSize ; i++){
        let mySubstr = t.substring(i,i+pSize)
        if(Number(mySubstr) <= Number(p))
            answer++;
    }
    
    
    
    
    return answer;
}