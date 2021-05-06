class GfG
{
	public int remAnagrams(String s,String s1)
        {
        //add code here.
        int count[]=new int[256];
        for (int i=0;i<s.length();i++)
        {
            count[s.charAt(i)]++;
        }
        for (int i=0;i<s1.length();i++)
        {
            count[s1.charAt(i)]--;
        }
        int sum=0;
        for (int i=0;i<256;i++)
        {
            if(count[i]!=0)
            {
                sum=sum+(int)Math.abs(count[i]);
            }
        }
        return sum;
    }
}
