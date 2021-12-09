/*Lab9: Word Search generator
 */
public class WordSearch {
    private char[][] data;

    /**Initialize the grid to the size specified
     *and fill all of the positions with '_'
     *@param rows is the starting height of the WordSearch
     *@param cols is the starting width of the WordSearch
     */

    public WordSearch(int rows, int cols) {
        this.data = new char[rows][cols];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = '_';
            }
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
        return temp;
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

    public boolean addWordHorizontal(String word, int row, int col) {
        if (data.length < col + word.length() || row > data.length || col > data.length) {
            return false;
        } else {
            for (int i = col; i < word.length() + col; i++) {
                if (data[row][i] != '_' && data[row][i] != word.charAt(i - col)) {
                    return false;
                }
            }
            for (int j = 0; j < word.length() + col; j++) {
                data[row][j] = word.charAt(j - col);
            }
        }
        return true;
    }
    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top to bottom, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     *and the board is NOT modified.
     */

    public boolean addWordVertical(String word, int row, int col) {
        if (data[0].length < row + word.length() || row > data.length || col > data.length) {
            return false;
        } else {
            for (int i = row; i < word.length() + row; i++) {
                if (data[i][col] != '_' && data[i][col] != word.charAt(i - row)) {
                    return false;
                }
            }
            for (int j = 0; j < word.length() + row; j++) {
                data[j][col] = word.charAt(j - row);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        WordSearch x = new WordSearch(10, 10);
        x.addWordVertical("hello", 0, 0);
        x.addWordHorizontal("haunt", 0, 0);
        x.addWordHorizontal("energ", 1, 0);
        x.addWordVertical("tgonp", 0, 4);
        x.addWordVertical("aniop", 0, 1);
        x.addWordHorizontal("linoo", 2, 0);
        x.addWordVertical("nrolp", 0, 3);
        x.addWordVertical("hellooo", 0, 5);
        x.addWordVertical("uener", 0, 2);
        x.addWordHorizontal("hauntheelp",0,0);
        x.addWordVertical("helloworld",0,0);

        System.out.println(x);
    }
}
