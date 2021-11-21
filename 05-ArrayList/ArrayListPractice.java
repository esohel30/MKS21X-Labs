import java.util.ArrayList;
public class ArrayListPractice {

public static ArrayList<String> replaceEmpty( ArrayList<String> data) {
  //return an new ArrayList that has all of the values of the original ArrayList except
  //that all empty strings are replaced with the word "Empty".
  for(int i=0; i <data.size(); i++) {
    if(data.get(i).equals("")) {
      data.set(i, "empty");
    }
  }
return data;
}


public static ArrayList<String> makeReversedList( ArrayList<String> data){
  //return a new ArrayList that is in the reversed order of the parameter.
  ArrayList<String>reverse = new ArrayList<String>();
  for(int i = data.size()-1; i > -1; i --){
    reverse.add(data.get(i));
    }
  return reverse;
}


//public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //when one list is longer than the other, just append the remaining values to the end.
//  }

  public static void main(String[] args) {
    ArrayList<String>words = new ArrayList<String>();
    words.add("morning");
    words.add("evening");
    words.add("night");
    words.add("");
    System.out.println(words);
    replaceEmpty(words);
    System.out.println(words);

  }
}
