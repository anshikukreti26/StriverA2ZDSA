/*
   A
  ABA
 ABCBA
ABCDCBA
*/

class Solution {

    void printTriangle(int n) {
        int i,j;
        for(i=1; i<=n; i++)
        {
            for(j=n; j>i; j--)
                System.out.print(" ");
            for(j=1; j<=i; j++)
                System.out.print((char)('A'+(j-1)));
            for(j=i; j>1; j--)
                System.out.print((char)('A'+(j-2)));
            System.out.println();
        }
    }
}
