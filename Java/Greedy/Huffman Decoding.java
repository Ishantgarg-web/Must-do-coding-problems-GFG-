class Decode
{
    //Function to return the decoded string.
    public static void printnodes(MinHeapNode root,String s,HashMap<String,Character> hm)
    {
        if(root==null)
        {
            return;
        }
        if(root.data!='$')
        {
            hm.put(s,root.data);
        }
        printnodes(root.left,s+"0",hm);
        printnodes(root.right,s+"1",hm);
    }
    static String decodeHuffmanData(MinHeapNode root, String s)
    {
        // add your code here
        HashMap<String,Character> hm=new HashMap<String,Character>();
        printnodes(root,"",hm);
        String ans="",temp="";
        for (int i=0;i<s.length();i++)
        {
            temp=temp+s.charAt(i);
            if(hm.containsKey(temp))
            {
                ans=ans+hm.get(temp);
                temp="";
            }
        }
        return ans;
    }
}

