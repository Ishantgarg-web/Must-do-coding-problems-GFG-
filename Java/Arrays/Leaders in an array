// Problem link: https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> al=new ArrayList<Integer>();
        int temp[]=new int[n];
        temp[n-1]=arr[n-1];
        for (int i=n-2;i>=0;i--)
        {
            temp[i]=(int)Math.max(temp[i+1],arr[i]);
        }
        for (int i=0;i<n;i++)
        {
            if(arr[i]==temp[i])
            {
                al.add(arr[i]);
            }
        }
        return al;
    }
}
