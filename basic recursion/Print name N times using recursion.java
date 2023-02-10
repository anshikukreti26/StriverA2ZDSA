class Solution {
    int c=0;
    void printGfg(int N) {
        // code here
        if(c==N)
        return;
        System.out.print("GFG ");
        c++;
        printGfg(N);
    }
}
