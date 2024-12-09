import java.util.Scanner;
public class Game{
  public static String getName(){
    //do this once
    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:

    System.out.println("Enter username");
    //Read one line of user input
    String userName = userInput.nextLine();
    //Do something with the input
    System.out.println("Username is: " + userName);
    return userName;
  }
  public static String turn(){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    String action = userInput.nextLine();
    if (action.equals("a") || action.equals("attack")) {
      return "";
    }
    if (action.equals("sp") || action.equals("special")) {
      return "";
    }
    if (action.equals("su") || action.equals("support")) {
      return "";
    }
    if (action.equals("quit")) {
      return "";
    }
    return "";
  }

  public static void main(String[]args){
    String playerName = getName();
    Ranger player = new Ranger(playerName, 50);
  }
}
