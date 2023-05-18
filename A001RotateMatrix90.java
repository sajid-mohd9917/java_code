import java.util.*;
import java.lang.*;
import java.io.*;

public class A001RotateMatrix90
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [][]arr=new int[n][n];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }
int [][]tarr=new int[n][n];
for(int i=0;i<n;i++)
{
  for(int j=0;j<n;j++)
  {
    tarr[j][i]=arr[i][j];
  }
}

for(int i=0;i<n;i++)
{
  int li=0;
  int ri=n-1;
  while(li<ri)
  {
    int temp=tarr[i][li];
    tarr[i][li]=tarr[i][ri];
    tarr[i][ri]=temp;
    li++;
    ri--;
  }
}

for(int i=0;i<n;i++)
{
  for(int j=0;j<n;j++)
  {
    System.out.print(tarr[i][j]+" ");
  }
  System.out.println();
}


    }
}


