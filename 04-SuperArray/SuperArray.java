public class SuperArray {
// instance variables
  private String[] data;
  private int size =0;

  // no input
  public SuperArray() {
    this.data = new String[10]; //ten is the default capacity
  }
  // one input
  public SuperArray(int pickcap) {
    this.data = new String[pickcap]; // allows user to pick capacity
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

  public void resize() {
    String[] duplicate = new String[size*2 +1]; //times 2 + 1 advised by Mr.Konstantinovich
    for(int w =0; w < size; w++) {
      duplicate[w] = data[w];
    }
    data = duplicate;
  }

  public void resize2() {  //diff from other because what if the user just wants to resize even if
    if(size >= data.length) { // there is space
      resize(data);
    }
  }

  public String get(int index) {
    if(index < size && index >=0) {
      return data[index];
    }
    System.out.println("Out of bounds error: check if it is less than 0 or it is greater than size");
    return null;
    // these are temporary
  }

  public String set(int index, String element) {
    if(index >= 0 && index < size){
      String duplicate = data[index];
      data[index] = element;
      return duplicate;
    }
    System.out.println("Out of bounds error: check if it is less than 0 or it is greater than size");
    return null;
    // these are temporary
    }

  public boolean add(String input){
    resize2(data);
    data[size] = input;
    size += 1;
    return true; // confusion ??
  }




  }
