import java.util.*;
import java.lang.*;
import java.io.*;


public class A001_unit4_1
{
	public static void main (String[] args) throws java.lang.Exception
	{

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int count=0;
for(int i=0;i<n;i++)
{
    for(int j=i+1;j<n;j++)
    {
        if(arr[i]-arr[j]==k || arr[i]-arr[j]==-k)
        {
            count++;
        }
    }
}
System.out.println(count);

	}
}




/*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no :");
       int n = sc.nextInt();

       System.out.println("enter diff:");
       int k = sc.nextInt();

       int []arr = new int[n];
       System.out.println("ente element;");
       for(int i =0; i<n;i++)
       {
        arr[i]=sc.nextInt();
       }
       System.out.println();

        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)

            {
                if(arr[i]-arr[j]==k)
                {
                    count++;
                }
            }

        }
System.out.println(count);
 */