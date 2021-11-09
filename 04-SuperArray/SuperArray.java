public class SuperArray {
  private String[] data;
  private int size = 0;

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
    String[] duplicate = new String[(size * 2) + 1]; // (* 2) + 1 advised by Mr.Konstantinovich
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

  int indexOf(String target){
    for(int i = 0; i < size; i ++) {
      if(target == data[i]) {
        return i;
      }
    }
    return -1;
  }

  int lastIndexOf(String target) {
    for(int i = size; i >= 0; i--){
      if(target == data[i]) {
        return i;
      }
    }
    return -1;
    }

  void add(int index, String value) {
    if(index < 0 || index > size) {
      System.out.println("error: check if the code is outside bounds");
    }
    String temp = "";
    for(int i = index; i < data.length; i++) {
      temp = data[i];
      data[i] = value;
      value = temp;
    }
  }

  String remove(int index) {
    if(index < 0 || index > size){
      System.out.println("out of bounds error: check if index is less than 0 or greater than size");
    }
    String[] dupe = new String[data.length];
    String l = data[index];
    for(int i = 0; i < index; i++) {
      dupe[i] = data[i];
    }
    for(int i = index ; i < data.length-1; i++){
      dupe[i] = data[ i +1];
    }
    data = dupe;
    return null; 
    }



}
