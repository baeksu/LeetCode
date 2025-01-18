class Solution {
public:
    string reverseVowels(string s) {
        int left = 0;
        int right = s.length()-1;
        char vowels[10] = {'a','e','i','o','u','A','E','I','O','U'};

        bool leftFlag = false;
        bool rightFlag = false;
        while(left < right){
            for(int i = 0 ; i< 10 ; i++){
                if(s[left] == vowels[i]) leftFlag = true;
                if(s[right] == vowels[i]) rightFlag = true;  
            }

            if(leftFlag && rightFlag){
                char tmp = s[left];
                s[left] = s[right];
                s[right] = tmp;

                leftFlag = false;
                rightFlag = false;
            }

            left = (leftFlag == true) ? left : ++left;
            right = (rightFlag == true) ? right : --right;
            

        }
        return s;
    }
};