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
                if(data[c - 1] > data[c]) {

                    placeHolder = data[c - 1]; //store prev value temporarily
                    data[c - 1] = data[c]; //classic triple swap
                    data[c] = placeHolder; //classic triple swap
                }

            }
        }
    }

    // sort number two
    /*Selection sort
*/
      public static void selectionSort(int[] data) {
          int minimum;
          int placeHolder;
          int start;
          int size = data.length;

           for (int c = 0; c < size; c++){
             start = c;
             minimum = data[c];

             // other loop to see where to and check if number less
             int j = c;
             while(j < size){
               if (data[j] < minimum){
                 start = j;
                 minimum = data[j];
               }
               j++;
             }

             //hold value and swap others
             placeHolder = data[c];
             data[c] = minimum;
             data[start] = placeHolder;
           }
          }


    // sort number three
    public static void insertionSort(int[] data) {
        // temp vals
        int index = 0;
        int current = 0;
        int size = data.length;

        for (int b = 1; b < size; b++) {
            index = b - 1;
            current = data[b];

            // problem: index goes out of bound when approaches zero
            // needs 2 conditions

            while ((index >= 0) && (data[index] > current))  {
                data[index + 1] = data[index];
                // decrement index
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
      int[] a = {1,2,3,4,5,6};
      int[] b = {5,1,12,-5,16,2,12,14};

      selectionSort(b);
      System.out.println(Arrays.toString(b));

    }
}
