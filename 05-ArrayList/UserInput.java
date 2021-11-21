import java.util.Scanner;
import java.util.ArrayList;

public class UserInput {

  public static void main(String[] args) {
    ArrayList<Double>storage = new ArrayList<Double>();
    Scanner in = new Scanner(System.in);
    int count =0;
    while(true) {
      System.out.println("Enter a non negative number. A negative number will end the program:");
      double input = in.nextDouble();
      if(input >= 0 ){
        storage.add(input);
        count ++;
      } else{
        break;
      }
    }
//fuction to get the largest double in the array list
    double max =storage.get(0);
    for(int i =0; i < storage.size(); i++) {
      if(storage.get(i) > max){
        max = storage.get(i);
      }
      }
//fuction to get the smallest double in the array list
      double min =storage.get(0);
      for(int i =0; i < storage.size(); i++) {
        if(storage.get(i) < min ){
          min = storage.get(i);
        }
        }
//code to get the sum of all digits in the array list
      double sum = 0;
      for(int i=0; i < storage.size(); i ++){
        sum += storage.get(i);
      }

    System.out.println("you entered: " + storage);
    System.out.println("mean: " + sum/count);
    System.out.println("min value: " + min);
    System.out.println("max value: " + max); 



  }
}
