import java.util.*;
import java.lang.*;
import java.io.*;

public class A001SpirarrlyTraMatrx
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
     Scanner sc = new Scanner(System.in);
     
     int r=sc.nextInt();
     int c=sc.nextInt();
     int [][]arr=new int[r][c];
for(int i=0;i<r;i++)
{
  for(int j=0;j<c;j++)
  {
    arr[i][j]=sc.nextInt();
  }
}

int minr=0;
int minc=0;
int maxr=r-1;
int maxc=c-1;
int te=r*c;
int count=0;

while(count<te)
{
  for(int i=minr,j=minc;j<=maxc;j++)
  {
    System.out.print(arr[i][j]+" ");
    count++;
  }

  minr++;
  for(int i=minr,j=maxc;i<=maxr;i++)
  {
    System.out.print(arr[i][j]+" ");
    count++;
  }
maxc--;
  for(int i=maxr,j=maxc;j>=minc;j--)
  {
    System.out.print(arr[i][j]+" ");
    count++;
  }
  maxr--;
  for(int i=maxr,j=minc;i>=minr;i--)
  {
    System.out.print(arr[i][j]+" ");
    count++;
  }
  minc++;
}


	}
}








/*

import java.util.*;
import java.lang.*;
import java.io.*;

public class A001SpirarrlyTraMatrx
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
     Scanner sc = new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
	  int [][]arr=new int[r][c];
      
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }

    int minr=0;
    int maxr=r-1;
    int minc=0;
    int maxc=c-1;
    int count =0;
    int te=r*c;
    
    if(count<te)
  {
    for(int i=minr,j=minc;i<=maxr &&count<te;i++)
    {
        System.out.print(arr[i][j]); 
      	count++;
    }
    minc++;
    for(int i=maxr,j=minc;j<=maxc &&count<te;j++)
    {
        System.out.print(arr[i][j]); 
     		 count++;
    }

     maxr--;
    for(int i=maxr,j=maxc;i<=minr &&count<te;i--)
    {
        System.out.print(arr[i][j]); 
    	  count++;
    }
    
    maxc--;
      for(int i=minr,j=maxc;j<=minc &&count<te;j--)
    {
        System.out.print(arr[i][j]); 
        count++;
    }
		minr++;

  }
    
    
    
	}
}


*/