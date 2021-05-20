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
	        int arr[]=new int[n];
	        Queue<Integer> q=new LinkedList<Integer>();
	        for (int i=0;i<n;i++)
	        {
	            //arr[i]=i+1;
	            q.offer(i+1);
	        }
	        while(q.size()!=1)
	        {
	            q.offer(q.poll());
	            q.poll();
	        }
	        System.out.println(q.poll());
	    }
	}
}
