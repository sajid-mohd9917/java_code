    

import java.util.*;

import javax.lang.model.util.ElementScanner14;

import java.lang.*;
import java.io.*;

public class A001unit10_4 
{

public static int ans(int []arr,int h,int ind)
{
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==h)
        {
            continue;
        }
    if(h<2*arr[i])
    {
        System.out.println(i);
        return -1;
    }
}
return ind;

}
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }

    int h=0;
    int ind=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]>h)
        {
            h=arr[i];
            ind=i;

        }
    }

    System.out.println( ans(arr,h,ind) );



    
 
	}
}