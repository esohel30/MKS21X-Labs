import java.util.Arrays;

public class Sorts{

  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */

  public static void bubbleSort(int[] data){
    int len = data.length -1;
    for(int i =0; i < len; i++){
      if(data[i] < data[i+1] && i != len -1){
        i++;
      }

      if(data[i] > data[i+1]){
        int current = data[i];
        data[i] = data[i+1];
        data[i+1] = current;
        i = -1;
        }
    }
  }

  public static void main(String[] args) {
    int[] a = {1,2,3,4,5,6};
    int[] b = {5,1,12,-5,16};
    int[] c = {1,-1,21,23,21,2};
    int[] d = {12,-2,32,21,2123};
    int[] e = {1,2,3,4,12,123,-1};
    int[] f = {-1,-2,-3,-4};


    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
    System.out.println(Arrays.toString(c));
    System.out.println(Arrays.toString(d));
    System.out.println(Arrays.toString(e));
    System.out.println(Arrays.toString(f));
    bubbleSort(a);
    bubbleSort(b);
    bubbleSort(c);
    bubbleSort(d);
    bubbleSort(e);
    bubbleSort(f);
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
    System.out.println(Arrays.toString(c));
    System.out.println(Arrays.toString(d));
    System.out.println(Arrays.toString(e));
    System.out.println(Arrays.toString(f));





  }



}
