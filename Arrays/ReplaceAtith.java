import java.util.*;

public class ReplaceAtith
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Index value where you want to replace:");
        int ReplaceIndex = sc.nextInt();

        System.out.println("Enter value for replace:");
        int ReplaceValue = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            if(i==ReplaceIndex)
            {
                arr[i]=ReplaceValue;   
            }
        }

        for(int array:arr)
        {
            System.out.println(array+" ");
        }
    }
}