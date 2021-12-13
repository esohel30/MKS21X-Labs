import java.util.*; //random, scanner, arraylist
import java.io.*; //file, filenotfoundexception
public class WordSearch {

    private char[][] data;
    private int seed;
    private Random randgen;
    private ArrayList < String > wordsAdded = new ArrayList < String > (0);

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
            if ((rowCopy < 0) || (rowCopy > data.length - 1) ||
                (colCopy < 0) || (colCopy > data[0].length - 1)) {
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
                    int a = (Math.abs(rng.nextInt() % (data.length)));
                    int b = (Math.abs(rng.nextInt() % (data[0].length)));
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
        WordSearch t1 = new WordSearch(10, 20, "data.java");
        WordSearch t2 = new WordSearch(10, 20, "data.java");
        WordSearch t3 = new WordSearch(10, 20, "data.java");
        WordSearch t4 = new WordSearch(20, 10, "data.java");
        WordSearch t5 = new WordSearch(15,15);
        WordSearch t6 = new WordSearch(5, 5, "data.java");
        WordSearch t7 = new WordSearch(25,25, "funwords.java");


        t5.addAllWords("data.java");


        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        System.out.println(t7);

    }

    /**Attempts to add a given word to the specified position of the WordGrid.
          *The word is added from left to right, must fit on the WordGrid, and must
          *have a corresponding letter to match any letters that it overlaps.
          *
          *@param word is any text to be added to the word grid.
          *@param row is the vertical locaiton of where you want the word to start.
          *@param col is the horizontal location of where you want the word to start.
          *@return true when the word is added successfully. When the word doesn't fit,
          * or there are overlapping letters that do not match, then false is returned
          * and the board is NOT modified.
          */

         // public boolean addWordHorizontal(String word, int row, int col) {
         //     if (data.length < col + word.length() || row > data.length || col > data.length) {
         //         return false;
         //     } else {
         //         for (int i = col; i < word.length() + col; i++) {
         //             if (data[row][i] != '_' && data[row][i] != word.charAt(i - col)) {
         //                 return false;
         //             }
         //         }
         //         for (int j = 0; j < word.length() + col; j++) {
         //             data[row][j] = word.charAt(j - col);
         //         }
         //     }
         //     return true;
         // }
         // /**Attempts to add a given word to the specified position of the WordGrid.
         //  *The word is added from top to bottom, must fit on the WordGrid, and must
         //  *have a corresponding letter to match any letters that it overlaps.
         //  *
         //  *@param word is any text to be added to the word grid.
         //  *@param row is the vertical locaiton of where you want the word to start.
         //  *@param col is the horizontal location of where you want the word to start.
         //  *@return true when the word is added successfully. When the word doesn't fit,
         //  *or there are overlapping letters that do not match, then false is returned.
         //  *and the board is NOT modified.
         //  */
         // public boolean addWordVertical(String word, int row, int col) {
         //     if (data[0].length < row + word.length() || row > data.length || col > data.length) {
         //         return false;
         //     } else {
         //         for (int i = row; i < word.length() + row; i++) {
         //             if (data[i][col] != '_' && data[i][col] != word.charAt(i - row)) {
         //                 return false;
         //             }
         //         }
         //         for (int j = 0; j < word.length() + row; j++) {
         //             data[j][col] = word.charAt(j - row);
         //         }
         //     }
         //     return true;
         // }
         // /**Attempts to add a given word to the specified position of the WordGrid.
         //  *The word is added from top left towards the bottom right, it must fit on the board,
         //  *and must have a corresponding letter to match any letters that it overlaps.
         //  *
         //  *@param word is any text to be added to the word grid.
         //  *@param row is the vertical locaiton of where you want the word to start.
         //  *@param col is the horizontal location of where you want the word to start.
         //  *@return true when the word is added successfully. When the word doesn't fit,
         //  *or there are overlapping letters that do not match, then false is returned
         //  *and the board is not modified.
         //  */
         // public boolean addWordDiagonal(String word, int row, int col) {
         //     int minLen = data.length;
         //     int maxPos = row;
         //
         //     if (minLen > data[0].length) {
         //         minLen = data[0].length;
         //     }
         //     if (maxPos < col) {
         //         maxPos = col;
         //     }
         //     if (minLen < word.length() + maxPos) {
         //         return false;
         //     } else {
         //         for (int j = 0; j < word.length(); j++) {
         //             if (data[row + j][col + j] != '_' && data[row + j][col + j] != word.charAt(j)) {
         //                 return false;
         //             }
         //         }
         //         for (int i = 0; i < word.length(); i++) {
         //             data[row + i][col + i] = word.charAt(i);
         //         }
         //         return true;
         //     }
         // }


}
