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

  public static boolean compares(int[] a, int[] b) {
    int lenA = a.length;
    int lenB = b.length;

    if(lenA != lenB){
      return false;
    }

    for(int i =0; i < lenA; i++){
      if(a[i] != b[i]){
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

    int[] a1 = {1,2,3,4,5,6};
    int[] b1 = {5,1,12,-5,16};
    int[] c1 = {1,-1,21,23,21,2};
    int[] d1 = {12,-2,32,21,2123};
    int[] e1 = {1,2,3,4,12,123,-1};
    int[] f1 = {-1,-2,-3,-4};

    bubbleSort(a);
    bubbleSort(b);
    bubbleSort(c);
    bubbleSort(d);
    bubbleSort(e);
    bubbleSort(f);

    Arrays.sort(a1);
    Arrays.sort(b1);
    Arrays.sort(c1);
    Arrays.sort(d1);
    Arrays.sort(e1);
    Arrays.sort(f1);

    System.out.println(compares(a,a1));
    System.out.println(compares(b,b1));
    System.out.println(compares(c,c1));
    System.out.println(compares(d,d1));
    System.out.println(compares(e,e1));
  }



}
