class Solution {
    public static void reverse(ArrayList<Integer> al)
    {
        for (int i=0;i<al.size()/2;i++)
        {
            int temp=al.get(i);
            al.set(i,al.get(al.size()-1-i));
            al.set(al.size()-1-i,temp);
        }
    }
    static ArrayList<Integer> increment(ArrayList<Integer> arr , int n) {
        // code here
        int carry=1;
        for (int i=n-1;i>=0;i--)
        {
            int temp=arr.get(i);
            arr.set(i,(arr.get(i)+carry)%10);
            carry=(temp+carry)/10;
        }
        if(carry == 1)
        {
            arr.add(0,1);
        }
        return arr;
    }
}
