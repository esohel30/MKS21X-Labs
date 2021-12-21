import java.util.*;
import java.util.ArrayList;
import java.io.*;

public class OrderedArrayList < T extends Comparable < T >> extends NoNullArrayList < T > {

    // constructors
    public OrderedArrayList() {
        super();
    }

    public OrderedArrayList(int cap) {
        super(cap);
    }

    // methods

    /*return the index that the value should be placed
    when inserting into the OrderedArrayList .*/
    private int whereToPlace(T element) {
        int size = super.size();
        int index = size;
        int j =0;

        if(element == null){
          return 0;
        }

        while (j < size) {
            if (super.get(j).compareTo(element) > 0) {
                index = j;
                break;
            } else {
                j++;
            }
        }
        return index;
    }


    @Override
    public boolean add(T element) {
        super.add(whereToPlace(element), element);
        return true;
    }

    @Override
    public void add(int idx, T element) {
        super.add(element);
    }

    @Override
    public T set(int index, T value) {
        T currentValue = super.remove(index);
        add(value);
        return currentValue;
    }
}
