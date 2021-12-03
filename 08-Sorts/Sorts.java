import java.util.Arrays;
import java.util.Random;
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

  public static void selectionSort(int[] ary) {
    int len = ary.length 





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

    bubbleSort(a);
    bubbleSort(b);
    bubbleSort(c);
    bubbleSort(d);
    bubbleSort(e);
    bubbleSort(f);
    bubbleSort(g);
    bubbleSort(h);
    bubbleSort(i);

    Arrays.sort(a1);
    Arrays.sort(b1);
    Arrays.sort(c1);
    Arrays.sort(d1);
    Arrays.sort(e1);
    Arrays.sort(f1);
    Arrays.sort(g1);
    Arrays.sort(h1);
    Arrays.sort(i1);


    System.out.println(compares(a,a1));
    System.out.println(compares(b,b1));
    System.out.println(compares(c,c1));
    System.out.println(compares(d,d1));
    System.out.println(compares(e,e1));
    System.out.println(compares(f,f1));
    System.out.println(compares(g,g1));
    System.out.println(compares(h,h1));
    System.out.println(compares(i,i1));

    int z = 0;
    System.out.println("here are the random test cases");
    while(z < 15){
      Random nft = new Random();
      int[] nums = new int[300];
      int[] bums = new int[300];
      for(int br =0; br < nums.length; br++){
        int temp = nft.nextInt();
        nums[br] = temp;
        bums[br] = temp;
      }

      Arrays.sort(nums);
      bubbleSort(bums);
      System.out.println("");
      System.out.println(compares(nums,bums));
      System.out.println(Arrays.equals(nums, bums));
      z++;
  }

  }

}
