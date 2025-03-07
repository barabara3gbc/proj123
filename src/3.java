import java.util.*;

public class Proj123 {
    public static void main(String[] args) {
        // Create an array of 10 numbers
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }

        // Print the array
        System.out.println(Arrays.toString(numbers));
    }
}
