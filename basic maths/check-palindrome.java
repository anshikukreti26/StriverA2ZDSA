class Solution {
    public boolean isPalindrome(int x) {
        if(x==0)
          return true;
        if(x<0 || x%10==0)
          return false;
        int rev=0;
        int t=x;
        while(t!=0)
        {
            int digit=t%10;
            t/=10;
            rev=rev*10+digit;
        }
        return x==rev;
    }
}
