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
                wordsToBeAdded.add(input.nextLine().toUpperCase() );
            }
            while(wordsToBeAdded.size() != 0) {
                int j = 0;
                int e = (Math.abs(rng.nextInt() % wordsToBeAdded.size()));
                String word = wordsToBeAdded.remove(e);

                while (j < 100) {
                    int a = (Math.abs(rng.nextInt() % (data.length)));
                    int b = (Math.abs(rng.nextInt() % (data[0].length)));
                    int c = rng.nextInt() % 2;
                    int d = rng.nextInt() % 2;

                    boolean condition = addWord(a, b, word, c, d);

                    if (condition == true) {
                        wordsAdded.add(word);
                        break;
                    }
                     else {
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
                 temp += data[i][j] + " ";
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
                wordsToBeAdded.add(input.nextLine().toUpperCase() );
            }
            while(wordsToBeAdded.size() != 0) {
                int j = 0;
                int e = (Math.abs(rng.nextInt() % wordsToBeAdded.size()));
                String word = wordsToBeAdded.remove(e);

                while (j < 100) {
                    int a = (Math.abs(rng.nextInt() % (data.length)));
                    int b = (Math.abs(rng.nextInt() % (data[0].length)));
                    int c = rng.nextInt() % 2;
                    int d = rng.nextInt() % 2;

                    boolean condition = addWord(a, b, word, c, d);

                    if (condition == true) {
                        wordsAdded.add(word);
                        break;
                    }
                     else {
                        j++;
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("insert file name properly");
        }
    }


    public static void main(String[] args) {
      int row = Integer.parseInt(args[0]);
      int col = Integer.parseInt(args[1]);
      String fileName = args[2];
      int method = Integer.parseInt(args[3]);
      if(args.length == 5){
        int seed = Integer.parseInt(args[4]);
      }

      if(args.length == 4){
      WordSearch t1 = new WordSearch(row, col, fileName);
      System.out.print(t1);
      }

      if(args.length == 5){
        WordSearch t1 = new WordSearch(row, col, fileName);
        System.out.print(t1);
      }



    }

  }
