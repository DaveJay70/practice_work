import java.util.*;

public class AssociativeArray
{
    public static void main(String[] args)
    {
        Map<String, Integer> marks = new HashMap<>();

        marks.put("Virat", 95);
        marks.put("Dhoni", 88);
        marks.put("Rohit", 76);

        System.out.println("Virat's marks: " + marks.get("Virat"));

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}