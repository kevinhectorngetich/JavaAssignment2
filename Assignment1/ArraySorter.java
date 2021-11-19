package Assignment1;// Importing Arrays class from the utility class
import java.util.Arrays;

// Main class
public class ArraySorter {

    // Main driver method
    public static void main(String[] args)
    {
        // Custom input array
        int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };

        // Applying sort() method over to above array
        // by passing the array as an argument
        Arrays.sort(arr);

        // Printing the array after sorting
        System.out.println("Modified arr[] : %s"+Arrays.toString(arr));
    }
}