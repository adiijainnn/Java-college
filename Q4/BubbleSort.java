import java.util.Scanner;

public class BubbleSort { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

        System.out.println("Sorted Array:");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        // Binary Search
        System.out.print("Enter number to search: ");
        int target = sc.nextInt();
        int low = 0, high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.println("Found at index " + mid);
                found = true;
                break;
            } else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        if (!found)
            System.out.println("Not found in array.");

        sc.close();
    }
}
