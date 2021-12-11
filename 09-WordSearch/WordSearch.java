import java.util.*; //random, scanner, arraylist
import java.io.*; //file, filenotfoundexception
public class WordSearch {

    private char[][] data;
    private int seed;
    private Random randgen;
    private ArrayList < String > wordsAdded = new ArrayList < String > (0);

    /**Initialize the grid to the size specified
     *and fill all of the positions with '_'
     *@param rows is the starting height of the WordSearch
     *@param cols is the starting width of the WordSearch
     */
    public WordSearch(int rows, int cols) {
        this.data = new char[rows][cols];
        clear();
    }

    public WordSearch(int rows, int cols, String fileName) {
        this.data = new char[rows][cols];
        clear();
        addAllWords(fileName);
    }

    public WordSearch(int rows, int cols, String fileName, int randSeed) {
        this.data = new char[rows][cols];
        clear();
        try {
            Random rng = new Random();
            int seed = rng.nextInt();
            this.seed = randSeed;
            rng = new Random(randSeed);
            ArrayList < String > wordsToBeAdded = new ArrayList < String > (0);
            File file = new File(fileName);
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                wordsToBeAdded.add(input.nextLine());
            }
            for (int i = 0; i < wordsToBeAdded.size(); i++) {
                int j = 0;
                while (j < 100) {
                    int a = (Math.abs(rng.nextInt() % data.length));
                    int b = (Math.abs(rng.nextInt() % data[0].length));
                    int c = rng.nextInt() % 2;
                    int d = rng.nextInt() % 2;
                    boolean condition = addWord(a, b, wordsToBeAdded.get(i), c, d);
                    if (condition == true) {
                        addWord(a, b, wordsToBeAdded.get(i), c, d);
                        wordsAdded.add(wordsToBeAdded.get(i));
                        break;
                    } else {
                        j++;
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("insert file name properly");
        }

    }

    /**Set all values in the WordSearch to underscores'_'*/
    private void clear() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = '_';
            }
        }
    }
    /**Each row is a new line, there is a space between each letter
     *@return a String with each character separated by spaces, and rows
     *separated by newlines.
     */
    public String toString() {
        String temp = "";
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                temp += data[i][j];
            }
            temp += "\n";
        }
        String words = "";
        for (int i = 0; i < wordsAdded.size(); i++) {
            if (i != wordsAdded.size() - 1) {
                words += wordsAdded.get(i) + ", ";
            } else {
                words += wordsAdded.get(i);
            }
        }
        return temp + "\n" + "words:" + words + "\n" + "seed: " + this.seed;
    }

    public boolean addWord(int row, int col, String word, int rowInc, int colInc) {

        if (colInc == 0 && rowInc == 0) {
            return false;
        }

        int rowCopy = row;
        int colCopy = col;

        for (int j = 0; j < word.length(); j++) {
            if ((rowCopy < 0) || (rowCopy > data.length - 1) || (rowCopy > data[0].length - 1) ||
                (colCopy < 0) || (colCopy > data.length - 1) || (colCopy > data[0].length - 1)) {
                return false;
            }
            if (data[rowCopy][colCopy] != '_' && data[rowCopy][colCopy] != word.charAt(j)) {
                return false;
            }
            rowCopy += rowInc;
            colCopy += colInc;
        }
        for (int i = 0; i < word.length(); i++) {
            data[row][col] = word.charAt(i);
            row += rowInc;
            col += colInc;
        }
        return true;
    }

    private void addAllWords(String fileName) {
        try {
            Random rng = new Random();
            int seed = rng.nextInt();
            this.seed = seed;
            rng = new Random(seed);
            ArrayList < String > wordsToBeAdded = new ArrayList < String > (0);
            File file = new File(fileName);
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                wordsToBeAdded.add(input.nextLine());
            }
            for (int i = 0; i < wordsToBeAdded.size(); i++) {
                int j = 0;
                while (j < 100) {
                    int a = (Math.abs(rng.nextInt() % data.length));
                    int b = (Math.abs(rng.nextInt() % data[0].length));
                    int c = rng.nextInt() % 2;
                    int d = rng.nextInt() % 2;
                    boolean condition = addWord(a, b, wordsToBeAdded.get(i), c, d);
                    if (condition == true) {
                        addWord(a, b, wordsToBeAdded.get(i), c, d);
                        wordsAdded.add(wordsToBeAdded.get(i));
                        break;
                    } else {
                        j++;
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("insert file name properly");
        }
    }

    public static void main(String[] args) {
        WordSearch t1 = new WordSearch(17, 17, "data.java");
        WordSearch t2 = new WordSearch(17, 17, "data.java");
        WordSearch t3 = new WordSearch(17, 17, "data.java");
        WordSearch t4 = new WordSearch(17, 17, "data.java", 1026802272);
        WordSearch t5 = new WordSearch(17, 17, "data.java", 1026802272);
        WordSearch t6 = new WordSearch(17, 17, "data.java", 1026802272);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);

    }
}
