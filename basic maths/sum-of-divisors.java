class Solution{
    static long sumOfDivisors(int N){
        // code here
        int i=1;
        long sum=0;
        while(i<=N)
        {
            sum+=(N/i)*i++;
        }
        return sum;
    }
}
