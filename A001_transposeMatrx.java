import java.util.*;
import java.lang.*;
import java.io.*;

public class A001_transposeMatrx
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner  sc = new Scanner(System.in);
    int n= sc.nextInt();
    int [][]arr = new int [n][n];
   
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }
int [][]tarr = new int[n][n];
for(int i=0;i<n;i++)
{
  for(int j=0;j<n;j++)
  {
    tarr[j][i]=arr[i][j];
  }
}

for(int i=0;i<n;i++)
{
  for(int j=0;j<n;j++)
  {
    System.out.print(tarr[i][j]+"");
  }
  System.out.println();
}


	}
}



/*

import java.util.*;
import java.lang.*;
import java.io.*;

public class A001_transposeMatrx
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
     Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
	  int [][]arr=new int[n][n];
      
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        arr[i][j]=sc.nextInt();
      }
      System.out.println();
    }

    
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        System.out.print(arr[j][i]+" "); 
      }
      System.out.println();
    }


	
	}
}

*/





