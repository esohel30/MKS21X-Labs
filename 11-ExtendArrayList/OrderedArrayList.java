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
      int idx = super.size();
      // takes the size of the og array list
      for (int j = 0; j < size; j++){
        if (val.compareTo(super.get(j)) < 0){
          // compares the values lexicographically
          idx = j;
          break;
        }
      }
      return idx;
  }

      @Override
    public boolean add(T value){
      super.add(value);
      int where = whereToPlace(value);
      super.remove(super.lastIndexOf(value));
      super.add(where, value);
      return true;
    }

    @Override
    public void add(int index, T value){
      super.add(value);
    }
