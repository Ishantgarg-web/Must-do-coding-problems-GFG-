class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        if(s.size()==(int)Math.ceil(sizeOfStack/2.0))
        {
            s.pop();
        }
        else
        {
            int x=s.pop();
            deleteMid(s,sizeOfStack);
            s.push(x);
        }
    } 
}
