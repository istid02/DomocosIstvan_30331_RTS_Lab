package Lab1;

import java.util.Arrays;
import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        // Creating an array to store 10 random numbers
        int[] randomNumbers = new int[10];

        // Generating 10 random numbers and store them in the array
        Random random = new Random();
        System.out.println("Unsorted Random Numbers:");
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100); // Changing 100 to any range you want
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();
        // Sorting the array
        Arrays.sort(randomNumbers);

        // Displaying the sorted numbers
        System.out.println("Sorted Random Numbers:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
    }
}
