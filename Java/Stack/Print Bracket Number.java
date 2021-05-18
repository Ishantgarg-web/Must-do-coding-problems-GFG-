class Solution {
    ArrayList<Integer> barcketNumbers(String S) {
        // code here
        ArrayList<Integer> al=new ArrayList<Integer>();
        Stack<Integer> st=new Stack<Integer>();
        int count=1;
        for (int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='(')
            {
                st.push(count);
                al.add(count);
                count++;
            }
            else if(S.charAt(i)==')')
            {
                al.add(st.peek());
                st.pop();
            }
        }
        return al;
    }
};
