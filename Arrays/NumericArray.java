import java.util.*;

public class NumericArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array:");
        int size = sc.nextInt();
        int[] Arr = new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Please Enter Value For "+i+" th index:");
            Arr[i] = sc.nextInt();
        } 

        System.out.println("Your Array Is:");
        for(int i=0;i<size;i++)
        {
            System.out.println("Value at. "+i+" is "+Arr[i]);
        }
    }
}