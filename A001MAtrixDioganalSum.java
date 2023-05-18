import java.util.Scanner;
public class A001MAtrixDioganalSum 
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

    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum=sum+arr[i][i]+arr[i][n-1-i];
    }
    if(n%2==0)
    {
        System.out.println(sum);
    }
    else
    {
        int sum1=sum-arr[n/2][n/2];
        System.out.println(sum1);
    }

    }
}