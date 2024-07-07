//List of integers having duplicates is given. Write a program to findout the sum of all the unique integers
import java.util.*;

public class CollectionTask8 {
    public static void main(String[] args) {
        List<Integer> numbersWithDuplicates = Arrays.asList(2, 3, 4, 3, 5, 4, 6, 5, 7);

        // Use a HashSet to store unique integers
        Set<Integer> uniqueNumbers = new HashSet<>(numbersWithDuplicates);

        // Calculate the sum of unique integers
        int sum = 0;
        for (int num : uniqueNumbers) {
            sum += num;
        }

        System.out.println("Sum of all unique integers: " + sum);
    }
}
