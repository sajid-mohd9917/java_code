    

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// public class  A001_unit9_4
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         int []arr=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();

//         }

        //sorting of the ARR
        // for(int i=0;i<n-1;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(arr[i]>arr[j])
        //         {
        //             int temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }


        // System.out.println(arr[n-2]);

         // for(int i=0;i<n;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }



        //reverse the array
   /*     int li=0;
        int ri=n-1;
        while(li<ri)
        {
            System.out.print("a");
            int temp=arr[li];
            arr[li]=arr[ri];
            arr[ri]=temp;
            li++;
            ri--;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

	}
}

*/






import java.util.Scanner;
public class A001_unit9_4{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int originalNo=n;
        
        int rev=1;
        int rem=0;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem*rem*rem;
            n=n/10;
            
        }
        System.out.println(rev);
        
        if(originalNo==rev)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }

        
    }
    
    
    
}