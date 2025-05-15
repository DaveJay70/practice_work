import java.util.*;

public class SearchingElementInArray
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

        System.out.println("Enter Element For Search:");
        int SearchValue = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            if(arr[i]==SearchValue)
            {
                System.out.println("Value Founded!!");
                System.out.println("Value is At."+i+"th Position.");
            }
        }

        for(int array:arr)
        {
            System.out.println(array+" ");
        }
    }
}