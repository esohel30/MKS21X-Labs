import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Wrapping {
    public static void main(String[] args) {
        try {
            if(args.length < 2){
              System.out.println("insert a file name and method next time");
              System.exit(1);
            }
            String fileName = args[0];
            int method = Integer.parseInt(args[1]);
            File file = new File(fileName);
            Scanner input = new Scanner(file);
            int count = 0;

            if(method == 1){
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] nums = line.split("x");

                int length = Integer.parseInt(nums[0]);
                int width = Integer.parseInt(nums[1]);
                int height = Integer.parseInt(nums[2]);
                int b1 = length * width;
                int b2 = length * height;
                int b3 = width * height;
                int min = b1;

                if (b2 <= b3 && b2 <= b1) {
                    min = b2;
                }
                if (b3 <= b2 && b3 <= b1) {
                    min = b3;
                }
                count += (2 * b1 + 2 * b2 + 2 * b3 + min);
            }
          }

          if(method == 2){
            while (input.hasNextLine()) {
              String line = input.nextLine();
              String[] nums = line.split("x");

              int length = Integer.parseInt(nums[0]);
              int width = Integer.parseInt(nums[1]);
              int height = Integer.parseInt(nums[2]);
              int p1 = 2 * (length + width);
              int p2 = 2 * (length + height);
              int p3 = 2 * (width  + height);
              int min = p1;

              if(p2 <= p1 && p2 <= p3){
                min = p2;
              }
              if(p3 <= p1 && p3 <= p2){
                min = p3;
              }

              count += (min + (length * width * height));

            }
          }
            System.out.println(count);
        } catch (FileNotFoundException ex) {
            System.out.println("insert file name properly");
        }
    }
}
