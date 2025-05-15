import java.util.*;

public class NumberChanging
{
    public static void main(String[] args)
    {
        int n=5;
        int increament=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(increament+" ");
                increament++;
            }
            System.out.println("");
        }
    }
}