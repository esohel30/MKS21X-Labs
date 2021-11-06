public class SuperArray {
// instance variables
  private String[] data;
  private int size;

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
    String temp = "[";
    for(int j =0; j < size -1; j++){
      if(j < size -2) {
      temp += data[j] + ", ";
      }
      else  {
        temp+= data[j];
      }
    }
    return temp + "]";
  }

  public String toStringDebug() {
    String temp = "[";
    for(int j =0; j < data.length; j++){
      if(j < data.length -2) {
      temp += data[j] + ", ";
      }
      else  {
        temp+= data[j];
      }
    }
    return temp + "]";
    }



  public boolean add(String newadd) {
    data[size] = newadd;
    size ++;
    return true;
    }

  public resize() {
    String[] duplicate = new String[size*2 +1]
    for(int w =0; w < size; w++) {
      duplicate[w] += data[w];
    }
    data = dupicate;
  }






  }
