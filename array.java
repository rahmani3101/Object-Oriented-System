/* Take an array as input from the user. Search a given number x and print the value and
index at which it occur.
*/

import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Create the array
        int[] arr = new int[n];

        // Input elements into the array
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the number to search for
        System.out.print("Enter the number to search: ");
        int x = scanner.nextInt();

        // Search for the number x in the array
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("Value " + x + " found at index " + i);
                found = true;
                break;
            }
        }

        // If the number is not found
        if (!found) {
            System.out.println("Value " + x + " not found in the array.");
        }

        scanner.close();
    }
}
