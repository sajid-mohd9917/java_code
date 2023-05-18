import java.util.Scanner;

public class A001MatrixDiagonalDifference
{
    public static void main(String[] args)
    {

//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         int [][]arr=new int[n][n];
        
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 arr[i][j]=sc.nextInt();

//             }
//         }

//         int sum =0;
// for(int i=0;i<n;i++)
// {
   
//         sum = sum +arr[i][i]+arr[i][n-1-i];
// }


// if(n%2!=0)
// {
//     sum =sum-arr[n/2][n/2];
// System.out.println(sum);
// }


// System.out.println(sum);





// }
// }








Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int [][]arr = new int[n][n];
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
        arr[i][j]=sc.nextInt();
    }
}

int sum1d =0;
for(int i=0;i<n;i++)
{
    sum1d =sum1d+arr[i][i];
}


int sum2d=0;
for(int i=0;i<n;i++)
{
    sum2d= sum2d+arr[i][n-1-i];
}

if(sum1d>sum2d)
{
    System.out.println("sum="+(sum1d-sum2d));
}
else
{
    System.out.println("sum="+(sum2d-sum1d));
}




    }
}
