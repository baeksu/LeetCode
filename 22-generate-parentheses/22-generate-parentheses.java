class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(n,0,0,"",ans);
        return ans;
    }
    
    public static void solve(int n, int cntOpen, int cntClose , String result, List<String> ans){
        
        if(cntOpen >= n && cntClose >= n){
            ans.add(result);
            return;
        }
        
        if(cntOpen < n){
            solve(n,cntOpen+1,cntClose,result+"(" ,ans);
        }
        
        if( cntOpen > cntClose && cntClose < n ){
            solve(n,cntOpen,cntClose+1,result+")" , ans);
        }  
        
    }
} 