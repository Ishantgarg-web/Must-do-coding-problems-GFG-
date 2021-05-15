class Solution{
    static List<Integer> primeFactors(int n){
        // code here
        ArrayList<Integer> al=new ArrayList<Integer>();
        int count=0;
        while(n%2==0)
        {
            count++;
            n=n/2;
        }
        if(count!=0){
        al.add(2);
        al.add(count);}
        count=0;
        if(n==1){return al;}
        while(n%3==0)
        {
            count++;
            n=n/3;
        }
        if(count!=0){
        al.add(3);
        al.add(count);
        }
        count=0;
        if(n==1){return al;}
        for (int i=5;i*i<=n;i=i+6)
        {
            while(n%i==0)
            {
                count++;
                n=n/i;
            }
            if(count!=0){
            al.add(i);
            al.add(count);}
            count=0;
            if(n==1)
            {
                return al;
            }
            while(n%(i+2)==0)
            {
                count++;
                n=n/(i+2);
            }
            if(count!=0){
            al.add(i+2);
            al.add(count);
            }
            count=0;
        }
        if(n>1)
        {
            al.add(n);
            al.add(1);
        }
        return al;
    }
}
