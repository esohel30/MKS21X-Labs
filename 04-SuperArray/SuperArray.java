public class SuperArray {
    private String[] data;
    private int size = 0;
    //--------------------------------------------------------------

    // no input
    public SuperArray() {
        this.data = new String[10]; //ten is the default capacity
    }
    // one input
    public SuperArray(int userpickcap) {
        if (userpickcap > 0 || userpickcap == 0) {
            this.data = new String[userpickcap]; // allows user to pick capacity
        } else {
            throw new IllegalArgumentException("the capacity you provided (" + userpickcap + ") is not allowed");
        }
    }
    //-------------------------------------------------------------


    public int size() {
        return size; //provides more functionality to user
    }
    //-------------------------------------------------------------


    public String toString() {
        String temp = "[";
        for (int j = 0; j < size; j++) {
            if (j < size - 1) {
                temp += data[j] + ", ";
            } else {
                temp += data[j];
            }
        }
        return temp + "]";
    }

    public String toStringDebug() {
        String temp = "[";
        for (int j = 0; j < data.length; j++) {
            if (j < data.length - 1) {
                temp += data[j] + ", ";
            } else {
                temp += data[j];
            }
        }
        return temp + "]";
    }
    //-------------------------------------------------------------


    public void resize() { // there will be two resize methods
        // one will be incase the user wants to; the other if it is needed.
        String[] duplicate = new String[(size * 2) + 1]; // (* 2) + 1 advised by Mr.Konstantinovich
        for (int idx = 0; idx < size; idx++) {
            duplicate[idx] = data[idx];
        }
        data = duplicate;
    }

    public void adjust() {
        if (data.length == size) {
            resize();
        }
    }
    //-------------------------------------------------------------


    public String get(int index) {
        if (index < size && index >= 0) {
            return data[index];
        } else {
            throw new IndexOutOfBoundsException("The index provided (" + index + ") is out of bounds");
            // throwing exception = also returns something
        }
    }

    public String set(int index, String element) {
        if (index > size && index >= 0) {
            String duplicate = data[index];
            data[index] = element;
            return duplicate;
        } else {
            throw new IndexOutOfBoundsException("The index provided (" + index + ") is out of bounds");
        }
    }
    //-------------------------------------------------------------


    public boolean add(String input) {
        adjust();
        data[size] = input;
        size += 1;
        return true; // confusion ??
    }
    //-------------------------------------------------------------

    public int indexOf(String target) {
        for (int i = 0; i < size; i++) {
            if (target == data[i]) {
                return i;
            }
        }
        return -1;
    }



    public int lastIndexOf(String target) {
        for (int i = size; i >= 0; i--) {
            if (target == data[i]) {
                return i;
            }
        }
        return -1;
    }
    //-------------------------------------------------------------



    String remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("the index provided (" + index + ") is out of bounds");
        }
        String[] dupe = new String[data.length];
        String l = data[index];
        for (int i = 0; i < index; i++) {
            dupe[i] = data[i];
        }
        for (int i = index; i < data.length - 1; i++) {
            dupe[i] = data[i + 1];
        }
        data = dupe;
        size--;
        return data[index];
    }

    public boolean remove(String target) {
        int instanceOne = indexOf(target);
        if (instanceOne == -1) {
            return false;
        } else {
            remove(instanceOne);
            return true;
        }
    }
    //-------------------------------------------------------------

    public void add(int index, String value) {
        adjust();
        if ( index <= size && index >= 0) {
              size ++;
              String temp = "";
              for (int i = index; i < data.length; i++) {
                  temp = data[i];
                  data[i] = value;
                  value = temp;
              }
          } else {
          throw new IndexOutOfBoundsException("the index provided (" + index + ") is out of bounds");
        }
      }
    //-------------------------------------------------------------
}
