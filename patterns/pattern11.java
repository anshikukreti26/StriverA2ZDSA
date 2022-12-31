/*
1 
0 1 
1 0 1
0 1 0 1 
1 0 1 0 1
*/

class Solution {

    void printTriangle(int n) {
        // code here
        int c;
        for(int i=1; i<=n; i++)
        {
            c=i%2==0?0:1;
            for(int j=1; j<=i; j++)
            {
                System.out.print(c+" ");
                c=c==0?1:0;
            }
            System.out.println();
        }
    }
}
