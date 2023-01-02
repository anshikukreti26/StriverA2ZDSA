class Solution{
    static int minJumps(int[] arr){
        // your code here
        int n=arr.length;
        if(arr[0]==0 && n>1)
        return -1;
        else if(n==1)
        return 0;
        else{
            int far=0;
            int curr=0;
            int jump=0;
            for(int i=0; i<n-1; i++)
            {
                far=Math.max(far, i+arr[i]);
                if(i==curr)
                {
                    jump++;
                    curr=far;
                }
            }
            if(curr<n-1)
            return -1;
            return jump;
        }
    }
}
