import java.util.*;
import java.lang.*;
import java.io.*;

public class A001_unit4_5
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
 Scanner sc = new Scanner(System.in);
 int n=sc.nextInt();
 int k=sc.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++)
{
  arr[i]=sc.nextInt();
}

int []rarr=new int[n];
  for(int i=0;i<n;i++)
  {
    rarr[(i+k)%n]=arr[i];
  }

  for(int i=0;i<n;i++)
  {
    System.out.print(rarr[i]+" ");
  }
}
}




/*Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),k=sc.nextInt(),q=sc.nextInt();
    
    int[]arr=new int[n];
    int []rotarr=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    
    for(int i=0;i<n;i++)
    {
      int newind=(i+k)%n;
      rotarr[newind]=arr[i];
    }
    
    for(int i=0;i<q;i++)
    {
      int qi = sc.nextInt();
      System.out.println(rotarr[qi]);
    } */