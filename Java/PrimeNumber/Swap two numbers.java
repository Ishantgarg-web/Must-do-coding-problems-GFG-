class Solution{
    static List<Integer> get(int a,int b)
    {
        // code here
        //a=(int)Math.abs(a-b);
        a=a-b;
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(b);
        al.add(b+a);
        return al;
    }
}
