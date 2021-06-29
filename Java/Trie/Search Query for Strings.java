static void insert(String key) 
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

//Function to use TRIE data structure and search the given string.
static boolean search(String key)
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
