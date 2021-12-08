/*Lab9: Word Search generator
*/
public class WordSearch{

    private char[][]data;
    /**Initialize the grid to the size specified
     *and fill all of the positions with '_'
     *@param rows is the starting height of the WordSearch
     *@param cols is the starting width of the WordSearch
     */
    public WordSearch(int rows,int cols){
      this.data = new char[rows][cols];
      for(int i=0; i < data.length; i++){
        for(int j=0; j <data[i].length; j++) {
          data[i][j] = '_';
        }
      }
    }

    /**Set all values in the WordSearch to underscores'_'*/
    private void clear(){
      for(int i=0; i < data.length; i++){
        for(int j=0; j <data[i].length; j++) {
          data[i][j] = '_';
        }
      }
    }

    /**Each row is a new line, there is a space between each letter
     *@return a String with each character separated by spaces, and rows
     *separated by newlines.
     */
    public String toString(){
      String temp = "";
      for(int i=0; i < data.length; i++){
        for(int j=0; j < data[i].length; j++) {
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
    public boolean addWordHorizontal(String word,int row, int col){
      if(data.length < col + word.length()){
        return false;
      }else{
        for(int i =col; i < word.length(); i++){
        for(int j=0; j < word.length(); j++){
          data[row][i] = word.charAt(j);
        }
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
    public boolean addWordVertical(String word,int row, int col){

      return true; // for now


    }





    public static void main(String[] args) {
      WordSearch x = new WordSearch(10,10);
      x.addWordHorizontal("ipsem", 2, 2);
      System.out.println(x);
    }
}