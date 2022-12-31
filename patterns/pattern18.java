/*
E
E D
E D C
E D C B
E D C B A
*/

class Solution {

    void printTriangle(int n) {
        // code here
        int i,j;
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print((char)('A'+(n-j))+" ");
            }
            System.out.println();
        }
    }
}
