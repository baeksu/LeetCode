class Solution {
    private final static String[] digitsToChars = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList();
        }
        
        List<String> candidates = new ArrayList<>();
        for (char c : digits.toCharArray()) {
            candidates.add(digitsToChars[c - '0']);
        }
        
        List<String> result = new ArrayList<>();
        letterCombinationsFrom(candidates, new StringBuilder(), result);
        return result;
    }

    private void letterCombinationsFrom(
        List<String> candidates, 
        
        StringBuilder curRes, 
        List<String> result) {
        
        // Base case
        if (curRes.length() == candidates.size()) {
            result.add(curRes.toString());
            return;
        }
        
        // Recursive cases
        String candidate = candidates.get(curRes.length());
        for (int i = 0; i < candidate.length(); i++) {
            curRes.append(candidate.charAt(i));
            letterCombinationsFrom(candidates, curRes, result);
            curRes.deleteCharAt(curRes.length() - 1); // Recover
        }
    }
}