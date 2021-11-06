public class SuperArray {
// instance variables
  private String[] data;
  private int size;

// constructors
  // no input
  public SuperArray() {
    this.data = new String[10]; //ten is the default capacity
    this.size = 0;
  }
  // one input
  public SuperArray(int pickcap) {
    this.data = new String[pickcap]; // allows user to pick capacity
    this.size = 0;
  }

  public int size() {
    return size;
  }

  public String toString() {
    String joe = "[";
   for (int i = 0; i < size; i++){
     joe += data[i];
     if (i <= size - 2) joe += ", ";
   }
   return joe + "]";
  }






  }
