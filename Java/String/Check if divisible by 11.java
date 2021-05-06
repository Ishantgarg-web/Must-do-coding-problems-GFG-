class Sol
{
    int divisibleBy11 (String s)
    {
        // Your Code Here
        long odd=0,even=0;
        for (int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                even=even+(s.charAt(i)-48);
            }
            else
            {
                odd=odd+(s.charAt(i)-48);
            }
        }
        if((even-odd)%11==0)
        {
            return 1;
        }
        return 0;
    }
}
