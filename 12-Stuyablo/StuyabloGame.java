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

    ArrayList<Adventurer>opponent = new ArrayList<>();
    Adventurer boss = new Warrior("Sussy bro");
    opponent.add(boss);

    boss.setmaxHP(280);
    boss.setHP(280);

    //Adventurers you control:
    //Make an ArrayList of Adventurers and add 3 Adventurers to it.
    ArrayList<Adventurer> party = new ArrayList<>();
    Adventurer playerOne = new Warrior("Imposter");
    Adventurer playerTwo = new Warrior("Baka");
    Adventurer playerThree = new Wizard("Hamood");

    party.add(playerOne);
    party.add(playerTwo);
    party.add(playerThree);



}
