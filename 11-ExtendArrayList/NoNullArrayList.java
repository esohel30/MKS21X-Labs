import java.util.ArrayList;

public class NoNullArrayList < T > extends ArrayList < T > {

    //constructors
    public NoNullArrayList() {
        super();
    }
    public NoNullArrayList(int cap) {
        super(cap);
    }

    //overriden methods
    
    @Override
    public T set(int idx, T element) {
        if (current == null) {
            throw new IllegalArgumentException();
        } else {
            super.set(idx, element);
        }
        return element;
    }

    @Override
    public boolean add(T element) {
        if (element == null) {
            throw new IllegalArgumentException();
        } else {
            super.add(element);
        }
        return true;
    }

    @Override
    public void add(int idx, T element) {
        if (element == null) {
            throw new IllegalArgumentException();
        } else {
            super.add(idx, element);
        }
    }

}
