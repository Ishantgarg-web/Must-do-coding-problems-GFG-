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
	        int n=input.nextInt();
	        Queue<String> q=new LinkedList<String>();
	        q.offer("1");
	        q.offer("2");
	        int count=0;
	        String x="";
	        if(n==1){System.out.println("1");}
	        else if(n==2){System.out.println(2);}
	        else
	        {
	           while(count<n)
	           {
	               x=q.poll();
	               q.offer(x+"1");
	               q.offer(x+"2");
	               count++;
	           }
	           System.out.println(x);
	        }
	    }
	}
}
