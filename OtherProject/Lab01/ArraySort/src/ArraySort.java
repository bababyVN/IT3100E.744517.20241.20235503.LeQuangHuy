import java.util.Scanner;
public class ArraySort {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter the number of elements in the array: ");
        int n = keyboard.nextInt();
        int[] array = new int[n];

        System.out.println("Please enter each of the " + n + " elements one by one:");
        for (int i = 0; i < n; i++) {
            array[i] = keyboard.nextInt();
        }

        Sort(array, n);

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        int average = sum / n;

        String sortedarray = "";
        for (int num : array) {
            sortedarray += num + " ";
        }
        System.out.println("Here's the result:");
        System.out.println(" Sorted Array: " + sortedarray);
        System.out.println(" Sum: " + sum);
        System.out.println(" Average: " + average);
    }
    
    private static void Sort(int[] array, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}