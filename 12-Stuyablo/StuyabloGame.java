import java.util.*;
public class StuyabloGame{

  private static final int WIDTH = 80;
  private static final int HEIGHT = 30;

  public static void main(String[] args) {
    run();
  }

  public static void drawParty(ArrayList<Adventurer> crew,int startRow){
    // loops through the array list of crew mates( amoung us refrence )
    for(int a = 0; a < crew.size(); a++){

      int current = crew.get(a).getHP();
      int original = crew.get(a).getmaxHP();
      int healthColor = 100;

      if(current <= original/4){
        healthColor = Text.RED;
      } else if(current >= (original/4) * 3){
        healthColor = Text.GREEN;

      } else {
        healthColor = Text.WHITE;
      }

      Text.go(startRow, 25*a +3);
      System.out.println(crew.get(a).getName());

      Text.go(startRow+2, 25*a +3);
      System.out.println(crew.get(a).getSpecialName() + ": " + crew.get(a).getSpecial() + "/" + crew.get(a).getSpecialMax());

      Text.go(startRow+3, 25*a +3);

      System.out.println("HP:"+ Text.colorize(current + "/" + crew.get(a).getmaxHP(), healthColor));

    }
  }

  public static void drawText(String s,int startRow){
    Text.go(startRow, 4);
    System.out.println(s);
  }


  public static void drawScreen(){
    // these four loops draw the horizantal lines.
    for(int b = 2; b < WIDTH; b++){
      Text.go(23,b);
      System.out.println(Text.colorize("*", Text.GREEN+Text.BACKGROUND));
    }

    for(int c= 2; c < WIDTH; c++){
      Text.go(29,c);
      System.out.println(Text.colorize("*", Text.YELLOW+Text.BACKGROUND));
    }

    for(int f = 2; f < WIDTH; f++){
      Text.go(1,f);
      System.out.println(Text.colorize("*", Text.RED+Text.BACKGROUND));
    }

      for(int a = 2; a < WIDTH; a++){
      Text.go(8,a);
      System.out.println(Text.colorize("*", Text.BLUE+Text.BACKGROUND));
    }

    //for drawing the vertical lines; they are shorter than the 30 sidelength however by the value of one
    // ask mr k if that is okay

    for(int v = 1; v < HEIGHT; v++){
      Text.go(v,80);
      System.out.println(Text.colorize("*", Text.MAGENTA+Text.BACKGROUND));
    }

    for(int z = 1; z < HEIGHT; z++){
      Text.go(z,1);
      System.out.println(Text.colorize("*", Text.MAGENTA+Text.BACKGROUND));
    }
  }


  public static void run(){

    Text.hideCursor();
    Text.clear();
    Text.go(1,1);

    ArrayList<Adventurer>enemies = new ArrayList<>();
    Adventurer boss = new Warrior("Sussy bro");
    enemies.add(boss);
    boss.setmaxHP(280);
    boss.setHP(280);

    ArrayList<Adventurer> party = new ArrayList<>();
    Adventurer playerOne = new Warrior("Imposter");
    Adventurer playerTwo = new Warrior("Bakaaaaaa");
    Adventurer playerThree=new Wizard ("Haamoooooooood");

    party.add(playerOne);
    party.add(playerTwo);
    party.add(playerThree);


    boolean partyTurn = false;
    int whichPlayer = 0;
    int turn = 0;


    String input = "";
    Scanner in = new Scanner(System.in);
    while(! (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("quit"))){

      //Draw the window border
      Text.hideCursor();
      drawScreen();

      //display event based on last turn's input
      if(partyTurn){
        //Process user input:

        if( input.equals("") || input.equals("attack")){
          Text.clear();

          Text.go(12,4);
          System.out.println(party.get(whichPlayer).attack(enemies.get(0)));
          Text.go(31,2);

         //display which player's turn is next and prompt for action.


        }
        else if(input.equals("special")){
          Text.clear();

          Text.go(12,4);
          System.out.println(party.get(whichPlayer).specialAttack(enemies.get(0)));
          Text.go(31,2);

         //display which player's turn is next and prompt for action.


        }
        whichPlayer++;



        if(whichPlayer < party.size()){
          drawText("Enter command for "+party.get(whichPlayer)+
                   ": attack/special/quit",HEIGHT/2);
        }else{
          drawText("press enter to see monster's turn",HEIGHT/2);
          partyTurn = false;
        }
      }else{
        //this block ignores user input!
        //display enemy attack except on turn 0.
        if(turn > 0){

    /////////////





        }

        //after enemy goes, change back to player's turn.
        partyTurn=true;
        whichPlayer = 0;
        //display which player's turn is next and prompt for action.
        drawText("Enter command for "+party.get(whichPlayer)+": attack/special/quit",HEIGHT/2);

        //end the turn.
        turn++;

      }

      //display current state of all Adventurers
      drawParty(party,2);
      drawParty(enemies,HEIGHT-5);

      //Draw the prompt
      Text.reset();
      Text.go(HEIGHT+1,1);
      Text.showCursor();
      System.out.print(">");
      //Read user input
      input = in.nextLine();
    }

    //After quit reset things:
    Text.reset();
    Text.showCursor();
    Text.go(32,1);
  }




}
