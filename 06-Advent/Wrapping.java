import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Wrapping {
    public static void main(String[] args) {

        try {
            String fileName = args[0];
            File file = new File(fileName);
            Scanner input = new Scanner(file);
            int count = 0;

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
            System.out.println(count);
        } catch (FileNotFoundException ex) {
            System.out.println("insert file name properly");
        }
    }
}
