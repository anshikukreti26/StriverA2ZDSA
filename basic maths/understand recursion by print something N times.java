
class Solution
{
    int k=1;
  public void printNos(int N)
    {
        //Your code here
        if(N==0)
        return;
        System.out.print(k + " ");
        k++;
        printNos(N-1);
    }
}
