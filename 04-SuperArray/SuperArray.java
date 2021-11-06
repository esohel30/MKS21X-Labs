public class SuperArray {
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
    return size; //provides more functionality to user
  }

  public String toString() {
    String temp = "[";
    for(int j =0; j < size; j++){
      if(j < size -1) {
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
      if(j < data.length -1) {
      temp += data[j] + ", ";
      }
      else  {
        temp+= data[j];
      }
    }
    return temp + "]";
    }

  public void resize() { // there will be two resize methods
    // one will be incase the user wants to; the other if it is needed.
    String[] duplicate = new String[(size* 2) + 1]; // (* 2) + 1 advised by Mr.Konstantinovich
    for(int idx =0; idx < size; idx++) {
      duplicate[idx] = data[idx];
    }
    data = duplicate;
  }

  public void resize2()  {
    if(data.length >= size){
      resize();
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
    resize2();
    data[size] = input;
    size += 1;
    return true; // confusion ??
  }






  }
