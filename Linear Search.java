import java.util.Scanner;

class Main {

    private static void LinearSearch(int[] arr, int item) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                System.out.println(item + " Found at index: " + i);
                return;
            }
        }
        System.out.println("Not found");
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Input array length
        System.out.print("Enter the number of elements in the array: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input item to search for
        System.out.print("Enter the item to search for: ");
        int item = scanner.nextInt();

        LinearSearch(arr, item);

    }
}


//Time Complexity	O(n)
//Best Case	O(1)
//Worst Case	O(n)
//Space Complexity	O(1)
//Avg. Comparisons	(n+1)/2
