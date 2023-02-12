// GFG

class Solution {
    int isPalindrome(String S) {
        // code here
        int start=0;
        int end=S.length()-1;
        while(start<end)
        {
            if(S.charAt(start)!=S.charAt(end)){
                return 0;
            }
            else{
                start++;
                end--;
            }
        }
        return 1;
    }
};


// LEETCODE

class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        else{
            int start=0;
            int end=s.length()-1;
            while(start<end)
            {
                char first=s.charAt(start);
                char last=s.charAt(end);
                if(!Character.isLetterOrDigit(first))
                    start++;
                else if(!Character.isLetterOrDigit(last))
                    end--;
                else{
                    if(Character.toLowerCase(first)!=Character.toLowerCase(last))
                        return false;
                    start++;
                    end--;
                }
            }
            return true;
        }
    }
}
