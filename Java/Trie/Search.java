static boolean search(TrieNode root, String key)
{
    // Your code here
    TrieNode curr=root;
    for (int i=0;i<key.length();i++)
    {
        if(curr.children[key.charAt(i)-'a']==null)
        {
            return false;
        }
        curr=curr.children[key.charAt(i)-'a'];
    }
    if(curr.isEndOfWord==true){return true;}
    return false;
}
