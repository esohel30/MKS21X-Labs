import java.util.*;
public class StuyabloGame{
  private static final int WIDTH = 80;
  private static final int HEIGHT = 30;
  private static final int BORDER_COLOR = Text.BLACK;
  private static final int BORDER_BACKGROUND = Text.WHITE + Text.BACKGROUND;

  public static void main(String[] args) {
    run();
  }


  public static void drawScreen(){
    // these four loops draw the horizantal lines.
    for(int b = 2; b < 80; b++){
      Text.go(23,b);
      System.out.println(Text.colorize("*", Text.GREEN+Text.BACKGROUND));
    }

    for(int c= 2; c < 80; c++){
      Text.go(29,c);
      System.out.println(Text.colorize("*", Text.YELLOW+Text.BACKGROUND));
    }

    for(int f = 2; f < 80; f++){
      Text.go(1,f);
      System.out.println(Text.colorize("*", Text.RED+Text.BACKGROUND));
    }

      for(int a = 2; a < 80; a++){
      Text.go(6,a);
      System.out.println(Text.colorize("*", Text.BLUE+Text.BACKGROUND));
    }



    //for drawing the vertical lines; they are shorter than the 30 sidelength however by the value of one
    // ask mr k if that is okay

    for(int v = 1; v < 30; v++){
      Text.go(v,80);
      System.out.println(Text.colorize("*", Text.MAGENTA+Text.BACKGROUND));
    }

    for(int z = 1; z < 30; z++){
      Text.go(z,1);
      System.out.println(Text.colorize("*", Text.MAGENTA+Text.BACKGROUND));
    }
  }





}
