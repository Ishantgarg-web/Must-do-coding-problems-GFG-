import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	  Scanner input=new Scanner(System.in);
	  int test=input.nextInt();
	  while(test-->0)
	  {
	      int q=input.nextInt();
	      Stack<Integer> st=new Stack<Integer>();
	      for (int i=0;i<q;i++)
	      {
	          String s=input.next();
	          if(s.equals("place"))
	          {
	              st.push(input.nextInt());
	          }
	          else
	          {
	              if(st.isEmpty()==true)
	              {
	                  System.out.print("-1 ");
	              }
	              else
	              {
	                  System.out.print(st.pop()+" ");
	              }
	          }
	          
	      }
	      System.out.println();
	  }
}
}
