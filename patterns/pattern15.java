/*
ABCDE
ABCD
ABC
AB
A
*/

class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=n; i>=1; i--)
        {
            char c='A';
            for(int j=1; j<=i; j++)
            {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
