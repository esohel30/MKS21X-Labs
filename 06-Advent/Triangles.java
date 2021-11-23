import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Triangles {
  public static void main(String[] args) {
      try {
          File file  = new File("deez.java");
          Scanner input = new Scanner(file);
          Scanner input1 = new Scanner(file);
          Scanner input2 = new Scanner(file);
          Scanner input3 = new Scanner(file);

          int count = 0;

          //while loop to test the first case
          while (input.hasNextInt()) {
              int side1 = input.nextInt();
              int side2 = input.nextInt();
              int side3 = input.nextInt();
              if( (side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2)){
                count ++;
              }
          }
          int x;
          int count1= 0;
          while (input1.hasNextInt()) {
              int side1 = input1.nextInt();
               x = input1.nextInt();
               x = input1.nextInt();
              int side2 = input1.nextInt();
               x = input1.nextInt();
               x = input1.nextInt();
              int side3 = input1.nextInt();
               x = input1.nextInt();
               x = input1.nextInt();

               System.out.println(side1);
               System.out.println(side2);
               System.out.println(side3);
               System.out.println("");

              if( (side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2)){
                count1 ++;
              }
          }
          int count2= 0;
          int i = 0;
          input2.nextInt();
          while (i < 32) {
              int side1 = input2.nextInt();
               input2.nextInt();
               input2.nextInt();
              int side2 = input2.nextInt();
               input2.nextInt();
               input2.nextInt();
              int side3 = input2.nextInt();
               input2.nextInt();
               input2.nextInt();
               i++;
              if( (side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2)){
                count2 ++;
              }
          }

          System.out.println("--------------------------");
          int count3= 0;
          int j = 0;
          input3.nextInt();
          input3.nextInt();
          while (j < 32) {
              int side1 = input3.nextInt();
               input3.nextInt();
               input3.nextInt();
              int side2 = input3.nextInt();
               input3.nextInt();
               input3.nextInt();
              int side3 = input3.nextInt();
               input3.nextInt();
               input3.nextInt();

               System.out.println(side1);
               System.out.println(side2);
               System.out.println(side3);
               System.out.println("");

               j++;
              if( (side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2)){
                count3 ++;
              }
          }



          System.out.println("\n" + count); //prints the number of successful triangles
          System.out.println(count1 + count2 + count3 + 2); // this is the count of the first column


          input.close();//releases the file from your program

      } catch (FileNotFoundException ex) {
            System.out.println("file not found");
      }
  }
}
