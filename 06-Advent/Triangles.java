import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Triangles {
  public static void main(String[] args) {

      try {
          if(args.length < 2 || args.length > 2){
            System.out.println("Error: Please correctly check the provided inputs");
            System.exit(-1);
          }

          String fileName = args[0];
          int pickMethod  = Integer.parseInt(args[1]);
          File file  = new File(fileName);
          Scanner input = new Scanner(file);
          Scanner input2 = new Scanner(file);
          int count = 0;

          if(pickMethod == 1){
            while (input.hasNextInt()) {
                int side1 = input.nextInt();
                int side2 = input.nextInt();
                int side3 = input.nextInt();
                if( (side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2)){
                  count ++;
                }
            }
          }

          if(pickMethod == 2){
            while(input2.hasNextInt()){
              int a = input2.nextInt();
              int b = input2.nextInt();
              int c = input2.nextInt();
              int d = input2.nextInt();
              int e = input2.nextInt();
              int f = input2.nextInt();
              int g = input2.nextInt();
              int h = input2.nextInt();
              int i = input2.nextInt();

              if( (a + d > g) && (a + g > d) && (d + g > a) ){
                count++;
              }
              if( (b + e > h) && (b + h > e) && (h + e > b) ){
                count++;
              }
              if( (c + f > i) && (c + i > f) && (i + f > c) ){
                count++;
              }

            }
          }

          System.out.println("\n"+count);
          input.close();//releases the file from your program

      } catch (FileNotFoundException ex) {
            System.out.println("insert file and method number in correct order");
      }
  }
}
