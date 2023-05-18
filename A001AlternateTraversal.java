
import java.util.Scanner;

public class A001AlternateTraversal

{
    public static void main(String[] args)
    {
    
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();

    
    int [][]arr=new int[n][n];
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            arr[i][j]=sc.nextInt();
        }
        System.out.println();//remove
    }

//second method of alternate traversal
for(int i=0;i<n;i++)
{
  if(i%2==0)
  { 
  for(int j=0;j<n;j++)
  {
    System.out.print(arr[i][j]+" ");
  }
  }
  else
    { 
      for(int j=n-1;j>=0;j--)
      {
        System.out.print(arr[i][j]+" ");
      }
  }
}


  }
}

//     int el=n*n;
// int count=0;
// while(count<el)
// {
//     for(int i=0;i<n;i=i+2)
//     {
//         for(int j=0;j<n &&count<el;j++)
//         {
//             System.out.print(arr[i][j]+" ");
//             count++;
//         }

//         for(int j=n-1;j>=0 &&count<el; j--){
//         System.out.print(arr[i+1][j]+" ");
//         count++;
//         }
//     }
    
// }     















/*  if(y%100==0 && y%400!=0)
    {
      System.out.println("0");
    }
    else if(y%4==0)
    {
      System.out.println("1");
      
    }
    else
    {
      System.out.println("0");
      
    } */







// import java.util.*;
// import java.lang.*;
// import java.io.*;

// public class A001AlternateTraversal
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		//your code here
//     Scanner sc = new Scanner(System.in);
//     int n=sc.nextInt();
    
//     int[]arr=new int[n];
//     for(int i=0;i<n;i++)
//     {
//       arr[i]=sc.nextInt();
//     } 


//     int h=0;
//     int gInd=0;
// for(int i=0;i<n;i++)
// {
//   if(arr[i]>h)
//   {
//     h=arr[i];
//     gInd=i;
//   }
// }
// System.out.println();


// for(int i=0;i<n;i++)      wrong code
// {
//   if(h<(2*arr[i]))
//   {
// System.out.println("-1");
//   }
// } 
// System.out.println(gInd);




// int ans1=ans(arr,h,gInd);
// System.out.println(ans1);



// 	}


//   public static int ans(int[] arr, int h, int gInd)
//    {
//     for(int i=0;i<arr.length;i++)
//     {
//       if(h<(2*arr[i]))
//       {
//         return -1;
//       }
//     }
//     return gInd;
//   }





// }