/*
****
*  *
*  *
****
*/

class Solution {

    void printSquare(int n) {
        // code here
        int i,j;
        for(i=1; i<=n; i++)
        {
            if(i==1 || i==n)
            {
            for(j=1; j<=n; j++)
            System.out.print("*");
            }
            else
            {
            System.out.print("*");
            for(j=1; j<=n-2; j++)
            System.out.print(" ");
            System.out.print("*");
            }
            System.out.println();
        }
    }
}    
