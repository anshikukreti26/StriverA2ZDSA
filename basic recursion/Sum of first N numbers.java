class Solution {
    long sum=0;
    long sumOfSeries(long N) {
        // code here
        if(N==1)
        return 1;
        return (long)(Math.pow(N,3))+sumOfSeries(N-1);
    }
}
