import java.util.Arrays;
import java.util.Random;

public class Sorts {

    // sort number one
    public static void bubbleSort(int[] data) {
        int placeHolder = 0;
        int size = data.length;

        // runs loops for amount of digits
        for (int b = 0; b < size; b++) {
            for (int c = 1; c < size - b; c++) {

                // if there is a value that is greater behind
                if (data[c - 1] > data[c]) {

                    placeHolder = data[c - 1]; //store prev value temporarily
                    data[c - 1] = data[c]; //swap
                    data[c] = placeHolder; //swap
                }

            }
        }
    }

    // sort number two
    public static void selectionSort(int[] ary) {
        int start = 0;
        int temp = 0;
        int min = 0;

        for (int i = 0; i < ary.length; i++) {
            for (int j = start; j < ary.length; j++) {
                min = ary[start];
                if (ary[j] < min) {
                    min = ary[j];
                    temp = ary[start];
                    ary[start] = min;
                    ary[j] = temp;
                }
            }
            
            start++; // increement the start value
        }
    }

    // sort number three
    public static void insertionSort(int[] data) {
        int index = 0;
        int current = 0;
        int size = data.length;

        for (int b = 1; b < size; b++) {
            index = b - 1;
            current = data[b];

            // problem: index goes out of bound when approaches zero
            // needs 2 conditions

            while ((index >= 0) && (data[index] > current)) {
                data[index + 1] = data[index];
                index--;
            }
            // swaps
            data[index + 1] = current;
        }
    }

    // my own method to compare arrays
    public static boolean compares(int[] a, int[] b) {
        int lenA = a.length;
        int lenB = b.length;
        if (lenA != lenB) {
            return false;
        }
        for (int i = 0; i < lenA; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int z = 0;
        System.out.println("here are the random test cases");
        while (z < 15) {
            Random nft = new Random();
            int[] nums = new int[300];
            int[] bums = new int[300];
            for (int br = 0; br < nums.length; br++) {
                int temp = nft.nextInt();
                nums[br] = temp;
                bums[br] = temp;
            }

            Arrays.sort(nums);
            selectionSort(bums);
            System.out.println("");
            System.out.println(compares(nums, bums));
            System.out.println(Arrays.equals(nums, bums));
            z++;
        }

    }
}
