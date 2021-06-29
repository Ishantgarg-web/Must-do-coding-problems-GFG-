static void insert(TrieNode root, String key) 
{
    // Your code here
    TrieNode curr=root;
    for (int i=0;i<key.length();i++)
    {
        if(curr.children[key.charAt(i)-'a']==null)
        {
            curr.children[key.charAt(i)-'a']=new TrieNode();
        }
        curr=curr.children[key.charAt(i)-'a'];
    }
    curr.isEndOfWord=true;
}
