/*
*********
 *******
  *****
   ***
    *
    */

class Solution {

    void printTriangle(int n) {
        // code here
for (int i=n; i>=1; i--) {

        for(int j=n;j>i;j--) {

            System.out.print(" ");

        }

        for(int j=1;j<(i*2);j++) {

            System.out.print("*");

        }

        System.out.println();
    }
}
}
