class Solution{
    static int evenlyDivides(int N){
        // code here
        int c=0;
        int t=N;
        while(t!=0)
        {
            int rem=t%10;
            if(rem!=0 && N%(rem%10)==0)
              c++;
            t/=10;
        }
        return c;
    }
}
