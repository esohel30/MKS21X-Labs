import java.util.ArrayList;
public class ArrayListPractice {

public static ArrayList<String> replaceEmpty( ArrayList<String> data) {
  //return an new ArrayList that has all of the values of the original ArrayList except
  //that all empty strings are replaced with the word "Empty".
  ArrayList<String>replaced = new ArrayList<String>();
  for(int i =0; i < data.size(); i++) {
    replaced.add(data.get(i));
  }
  for(int i=0; i< replaced.size(); i++) {
    if(replaced.get(i).equals("")) {
      replaced.set(i, "empty");
    }
  }
  return replaced;
}

public static ArrayList<String> makeReversedList( ArrayList<String> data){
  //return a new ArrayList that is in the reversed order of the parameter.
  ArrayList<String>reversed = new ArrayList<String>();
  for(int i = data.size()-1; i > -1; i --){
    reversed.add(data.get(i));
    }
  return reversed;
}


public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //when one list is longer than the other, just append the remaining values to the end.
  ArrayList<String>mixed = new ArrayList<String>();
  if(a.size() == b.size()){
    for(int i=0; i< b.size(); i ++){
      mixed.add(a.get(i));
      mixed.add(b.get(i));
    }
    }
  if(a.size() < b.size()){
    for(int i=0; i< a.size(); i ++){
      mixed.add(a.get(i));
      mixed.add(b.get(i));
    }
    for(int i = a.size() ; i < b.size(); i ++){
      mixed.add(b.get(i));
    }
  }

  if(a.size() > b.size()){
    for(int i=0; i< b.size(); i ++){
      mixed.add(a.get(i));
      mixed.add(b.get(i));
    }
    for(int i = b.size() ; i < a.size(); i ++){
      mixed.add(a.get(i));
    }
  }

    return mixed;
 }


  public static void main(String[] args) {
    ArrayList<String>words = new ArrayList<String>();
    ArrayList<String>birds = new ArrayList<String>();

    words.add("I");
    words.add("love");
    words.add("cake");
    birds.add("really");
    birds.add("good");
    birds.add("lol");
    birds.add("lol");



    System.out.println(words);
    System.out.println(replaceEmpty(words));
    System.out.println(words);
    System.out.println(makeReversedList(words));
    System.out.println(mixLists(birds, words));


  }
}
