import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,large=0,count=0;
        n = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i] = sc.nextInt();
        }
        large = ar[0];
        for (int i = 0; i < n; i++) 
        {
            if(ar[i] > large)
            {
                large = ar[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(large == ar[i])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
