* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

class Solution {

    void printTriangle(int n) {
        char c;
        for(int i=n; i>=1; i--)
        {
            c='A';
            for(int j=1; j>=i; j++)
            {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
