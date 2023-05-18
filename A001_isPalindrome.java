/*
import java.util.*;
import java.lang.*;
import java.io.*;

public class A001_isPalindrome {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner scn = new Scanner(System.in);
    int[] arr = new int[5];
    for (int i = 0; i < 5; i++) {
      arr[i] = scn.nextInt();

    }

    int li = 0;
    int ri = arr.length - 1;
    while (li < ri) {
      if (arr[li] != arr[ri]) {
        System.out.println(false);
        return;

      }
      ri--;
      li++;

    }
    System.out.println(true);

  }
}
*/

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class A001_isPalindrome
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();

//     for(int i=1;i<=n;i++)
//     {
//       for(int j=1;j<=n-i;j++)
//       {
//         System.out.print("-");
//       }  
//       for(int j=1;j<=i;j++)
//       {
//         System.out.print("*");
//       }
//       for(int j=i-1;j>0;j--)
//       {
//         System.out.print("*");

//       }
// System.out.println();
    

//   }


//   for(int i=1;i<=n;i++)
//     {
//   for(int j=1;j<=i;j++)
//   {
//     System.out.print("-");
//   }  

//   for(int j=1;j<=n-1-i;j++)
//   {
//     System.out.print("*");
//   }  
  
//   for(int j=1;j<=n-i;j++)
//   {
//     System.out.print("*");
//   }  
//   System.out.println();
// }


int sp=n/2;
int st=1;
for( int i=1;i<=n;i++)
{
  for(int j=1;j<=sp;j++)
  {
    System.out.print("-");
  }
  for(int j=1;j<=st;j++)
  {
    System.out.print("*");
  }
  if(i<=(n/2))
  {
    sp--;
    st=st+2;
  }
  else
  {
    sp++;
    st=st-2;
  }
  System.out.println();
}



  }
}
