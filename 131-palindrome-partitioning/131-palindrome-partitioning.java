import java.util.*;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        solve(s, 0, result, ans );
        return ans;
    }
    
    // ArrayList<Fruit> copyOfFruitList = (ArrayList<Fruit>) fruitList.clone();

    
    public static void solve(String s, int start, ArrayList<String> result, List<List<String>> ans){
        
        //끝까지 온경우, 이전까지의 substring 들은 모두 팰린드롬이라고 생각
        if(start == s.length()){
            ArrayList<String> tmp = (ArrayList<String>)result.clone();
            ans.add(tmp);
            return;
        }
        
        for(int i = start+1 ; i<=s.length() ; i++ ){
            //pivot 을 기준으로 palindrome 을 체크
            String left = s.substring(start, i);            
            
            //right 에 대한 재귀를 타주자
            if(isPalindrome(left)){    
                String right = s.substring(i, s.length());
                result.add(left);
                solve(s, i, result, ans);
                result.remove(result.size()-1);
            }
        }
    }
    
    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
        
}