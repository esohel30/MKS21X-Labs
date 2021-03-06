import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Non {
    // method number one
    public static boolean hasVowels(String a) {
        String vowels = "aeiou";
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (vowels.contains(a.substring(i, i + 1))) {
                count++;
            }
        }
        if (count > 2) return true;
        return false;
    }

    // method number two
    public static boolean twice(String a) {
        for (int i = 0; i < a.length() - 1; i++) {
            String current = a.substring(i, i + 1);
            String future = a.substring(i + 1, i + 2);
            if (current.equals(future)) {
                return true;
            }
        }
        return false;
    }

    // method number three
    public static boolean exceptions(String a) {
        String exp1 = "ab";
        String exp2 = "cd";
        String exp3 = "pq";
        String exp4 = "xy";
        if (a.contains(exp1) || a.contains(exp2) || a.contains(exp3) || a.contains(exp4)) {
            return false;
        }
        return true;
    }

    public static boolean doublePair(String a) {
        int len = a.length();
        for (int i = 0; i < len - 1; i++) {
            String currentPair = a.substring(i, i + 2);
            String rest = a.substring(i + 2, len);

            if (rest.contains(currentPair)) {
                return true;
            }
        }
        return false;
    }

    public static boolean spaceRep(String a) {
        int len = a.length();
        for (int i = 0; i < len - 2; i++) {
            if (a.substring(i, i + 1).equals(a.substring(i + 2, i + 3))) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                System.out.println("insert a file name next time");
                System.exit(1);
            }

            File file = new File(args[0]);
            Scanner input = new Scanner(file);
            int method = Integer.parseInt(args[1]);
            int count = 0;

            if (method == 1) {
                while (input.hasNextLine()) {
                    String currentLine = input.nextLine();
                    if (hasVowels(currentLine) && twice(currentLine) && exceptions(currentLine)) {
                        count++;
                    }
                }
            }

            if (method == 2) {
                while (input.hasNextLine()) {
                    String currentLine = input.nextLine();
                    if (doublePair(currentLine) && spaceRep(currentLine)) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        } catch (FileNotFoundException ex) {
            System.out.println("insert file name properly");
        }
    }

}
