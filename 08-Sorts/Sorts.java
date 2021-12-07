import java.util.Arrays;
import java.util.Random;

public class Sorts {
    /**Bubble sort of an int array.
     *Upon completion, the elements of the array will be in increasing order.
     *@param data  the elements to be sorted.
     */

    // sort number one
    public static void bubbleSort(int[] data) {
        int len = data.length - 1;
        for (int i = 0; i < len; i++) {
            if (data[i] < data[i + 1] && i != len - 1) {
                i++;
            }
            if (data[i] > data[i + 1]) {
                int current = data[i];
                data[i] = data[i + 1];
                data[i + 1] = current;
                i = -1;
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
            start++;
        }
    }

    // sort number three
    public static void insertionSort(int[] data) {
        int len = data.length;
        for (int b = 1; b < len; b++) {
            int index = b - 1;
            int current = data[b];
            while ((index >= 0) && (data[index] > current)) {
                data[index + 1] = data[index];
                index--;
            }
            data[index + 1] = current;
        }
    }


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
  
  }

}
