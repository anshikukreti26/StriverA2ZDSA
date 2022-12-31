/*
A
BB
CCC
DDDD
EEEEE
*/

class Solution {

    void printTriangle(int n) {
        // code here
        char c='A';
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            System.out.print(c);
          c++;
          System.out.println();
        }
    }
}
