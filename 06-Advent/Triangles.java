import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Triangles {
  public static void main(String[] args) {
      try {
          File file  = new File("deez.java");
          Scanner input = new Scanner(file);
          int count = 0;

          while (input.hasNextInt()) {
              int side1 = input.nextInt();
              int side2 = input.nextInt();
              int side3 = input.nextInt();
              if( (side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2)){
                count ++;
              }

          }
          System.out.print(count);
          input.close();//releases the file from your program

      } catch (FileNotFoundException ex) {
          //File not found
      }
  }
}
