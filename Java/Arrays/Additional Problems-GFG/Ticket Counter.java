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
	     int k=input.nextInt();
	     int arr[]=new int[n+1];
	     arr[0]=0;
	     for (int i=1;i<=n;i++)
	     {
	         arr[i]=i;
	     }
	     boolean flag=true;
	     int left=1,right=n;
	     while(right-left>k)
	     {
	         if(flag)
	         {
	             left=left+k;
	             flag=false;
	         }
	         else
	         {
	             right=right-k;
	             flag=true;
	         }
	     }
	     if(flag)
	     {
	         System.out.println(right);
	     }
	     else
	     {
	         System.out.println(left);
	     }
	 }
}
}
