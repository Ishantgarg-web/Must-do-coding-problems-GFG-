import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static boolean equalzeroandones(String str)
    {
        int count0=0,count1=0;
        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='0')
            {
                count0++;
            }
            else
            {
                count1++;
            }
        }
        return (count0==count1);
    }
    public static boolean validstring(String s)
    {
        int count0=0,count1=0;
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                count0++;
            }
            else
            {
                count1++;
            }
            if(count0<count1)
            {
                return false;
            }
        }
        return true;
    }
	public static void main (String[] args)
	 {
	 //code
	  Scanner input=new Scanner(System.in);
	  int test=input.nextInt();
	  while(test-->0)
	  {
	      int n=input.nextInt();
	      String s=input.next();
	      //System.out.println(validstring(s));
	      if(equalzeroandones(s) && validstring(s))
	      {
	          System.out.println("yes");
	      }
	      else
	      {
	          System.out.println("no");
	      }
	  }
}
}
