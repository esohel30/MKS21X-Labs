import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class NoNullArrayList < T > extends ArrayList < T > {

    public NoNullArrayList() {
        super();
    }

    public NoNullArrayList(int initialcap) {
        super(initialcap);
    }

    @Override
    public T set(int idx, T current) {
        if (current == null) {
            throw new IllegalArgumentException();
        } else {
            super.set(idx, current);
        }
        return current;
    }

    @Override
    public boolean add(T current) {
        if (current == null) {
            throw new IllegalArgumentException();
        } else {
            super.add(current);
        }
        return true;
    }

    @Override
    public void add(int idx, T current) {
        if (current == null) {
            throw new IllegalArgumentException();
        } else {
            super.add(idx, current);
        }
    }

}
