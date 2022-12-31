/*
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/

class Solution {

    void printTriangle(int n) {
        int i,j;
        for(i=n; i>=1; i--)
        {
            for(j=1; j<=i; j++)
                System.out.print("*");
            for(j=1; j<=2*(n-i); j++)
                System.out.print(" ");
            for(j=1; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=i; j++)
                System.out.print("*");
            for(j=1; j<=2*(n-i); j++)
                System.out.print(" ");
            for(j=1; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }       
    }
}
