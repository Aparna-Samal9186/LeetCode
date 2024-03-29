//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        HashMap<Integer,Integer> hs=new HashMap<>();
        
        for(int i=0; i < a.length;i++){
            if(!hs.containsKey(a[i])){
                hs.put(a[i],1);
            }
            if(hs.containsKey(a[i]) && hs.get(a[i])>size/2){
                return a[i];
            }
            if(hs.containsKey(a[i])){
                hs.put(a[i],hs.get(a[i])+1);
            }
        }
        return -1;
    }
}