public static boolean find(int n)
{
    int c1=0,c2=0;
    while(n>0)
    {
        if(n%10==1 || n%10==2 || n%10==3)
        {
            c1++;
        }
        c2++;
        n=n/10;
    }
    return (c1==c2);
    //return false;
}
public static void findAll()
{
    //Your code here
    for (int i=0;i<1000000;i++)
    {
        if(find(i))
        {
            mp.put(i,1);
        }
    }
}
  
     
