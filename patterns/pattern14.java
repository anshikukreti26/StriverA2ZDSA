/*
A
AB
ABC
ABCD
ABCDE
*/

class Solution {

    void printTriangle(int n) {
        // code here
        char c;
        for(int i=1; i<=n; i++)
        {
            c='A';
            for(int j=1; j<=i; j++)
            {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
