class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long[]arr=new Long[2];
        Long gcd=Gcd(A,B);
        Long lcm=(A*B)/gcd;
        arr[0]=lcm;
        arr[1]=gcd;
        return arr;
    }
    public static Long Gcd(Long A, Long B)
    {
        if(B==0)
        return A;
        return Gcd(B, A%B);
    }
};
