class Solution {
    static String armstrongNumber(int n){
        // code here
        int digit;
        int t=n;
        int sum=0;
        while(t!=0)
        {
            digit=t%10;
            t/=10;
            sum+=Math.pow(digit,3);
        }
        if(sum==n)
        return "Yes";
        else
        return "No";
    }
}
