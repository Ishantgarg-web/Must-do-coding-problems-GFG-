// Problem link: https://practice.geeksforgeeks.org/problems/nth-fibonacci-number1335/1


class Solution {
    static long nthFibonacci(long n){
        // code here
        long fibo[]=new long[(int)n+1];
        Arrays.fill(fibo,-1);
        int m=1000000007;
        if(n<=1)
        {
            return n;
        }
        else
        {
            fibo[0]=0;
            fibo[1]=1;
            for (int i=2;i<=n;i++)
            {
                fibo[i]=((fibo[i-1]%m)+(fibo[i-2]%m))%m;
            }
            return fibo[(int)n];
        }
    }
}
