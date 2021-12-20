import java.util.*;
import java.util.ArrayList;
import java.io.*;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  /*return the index that the value should be placed
  when inserting into the OrderedArrayList .*/

  private int whereToPlace(T val){
      int size = super.size();
      // takes the size of the og array list
      for (int j = 0; j < size; j++){
        if (val.compareTo(super.get(j)) < 0){
          // compares the values lexicographically
          size = j;
          break;
        }
      }
      return size;
  }
