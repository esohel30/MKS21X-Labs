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
        for (int i = 1; i < len; i++) {
            int index = i - 1;
            int current = data[i];
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


    int[] a = {1,2,3,4,5,6};
    int[] b = {5,1,12,-5,16};
    int[] c = {1,-1,21,23,21,2};
    int[] d = {12,-2,32,21,2123};
    int[] e = {1,2,3,4,12,123,-1};
    int[] f = {-1,-2,-3,-4};
    int[] g = {0};
    int[] h = {};
    int[] i = {1,1,1,1,1,1,1,1,1};

    int[] a1 = {1,2,3,4,5,6};
    int[] b1 = {5,1,12,-5,16};
    int[] c1 = {1,-1,21,23,21,2};
    int[] d1 = {12,-2,32,21,2123};
    int[] e1 = {1,2,3,4,12,123,-1};
    int[] f1 = {-1,-2,-3,-4};
    int[] g1 = {0};
    int[] h1 = {};
    int[] i1 = {1,1,1,1,1,1,1,1,1};


      Arrays.sort(a1);
      Arrays.sort(b1);
      Arrays.sort(c1);
      Arrays.sort(d1);
      Arrays.sort(e1);
      Arrays.sort(f1);
      Arrays.sort(g1);
      Arrays.sort(h1);
      Arrays.sort(i1);

      insertionSort(a);
      insertionSort(b);
      insertionSort(c);
      insertionSort(d);
      insertionSort(e);
      insertionSort(f);
      insertionSort(g);
      insertionSort(h);
      insertionSort(i);

    System.out.println(compares(a,a1));
    System.out.println(compares(b,b1));
    System.out.println(compares(c,c1));
    System.out.println(compares(d,d1));
    System.out.println(compares(e,e1));
    System.out.println(compares(f,f1));
    System.out.println(compares(g,g1));
    System.out.println(compares(h,h1));
    System.out.println(compares(i,i1));
  }

}
