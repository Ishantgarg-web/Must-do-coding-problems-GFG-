class Solution{
    public static int fun(int n)
    {
        int sum=0;
        for (int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
    static int sumOfDivisors(int n){
        // code here
        ArrayList<Integer> al=new ArrayList<Integer>();
        for (int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                al.add(i);
            }
        }
        int sum=0;
        for (int i=0;i<al.size();i++)
        {
            sum=sum+fun(al.get(i));
        }
        return sum;
    }
}
