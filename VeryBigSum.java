import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=0;
        long sum=0;
        n = sc.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextLong();
        }
        for(int i=0;i<n;i++)
        {
            sum +=arr[i];
        }
        System.out.println(sum);
    }
}