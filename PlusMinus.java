import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int negative=0,positive=0,zero=0;
        float neg_abs,pos_abs,zero_abs,nf;
        double print1,print2,print3;
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i] < 0)
            {
                negative++;
            }
            else if(a[i] > 0)
            {
                positive++;
            }
            else if(a[i] == 0)
            {
                zero++;
            }            
        }    
        nf = n;
        neg_abs = negative;
        pos_abs = positive;
        zero_abs = zero;
        print1 = pos_abs/nf;
        print2 = neg_abs/nf;
        print3 = zero_abs/nf;
        System.out.printf("%.6f",print1);
        System.out.println();
        System.out.printf("%.6f",print2);
        System.out.println();
        System.out.printf("%.6f",print3);
    }
}
