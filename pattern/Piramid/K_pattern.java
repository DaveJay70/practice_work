public class K_pattern
{
     public static void main(String args[])
    {
        int n1 = 5;
        for(int i = n1;i>=1;i--)
        {
            for(int j=0;j<i;j++)    
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        int n =5;
        for(int i=2;i<=n;i++)
        {
            for(int j = 0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        

    }
}