import java.util.Scanner;
import java.util.Random;
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
  public static String turn(Adventurer p, Adventurer o){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    String action = userInput.nextLine();
    if (action.equals("a") || action.equals("attack")) {
      return p.attack(o);
    }
    if (action.equals("sp") || action.equals("special")) {
      return p.specialAttack(o);
    }
    if (action.equals("su") || action.equals("support")) {
      return p.support();
    }
    if (action.equals("quit")) {

      System.out.println("\u001b[H");
      System.exit(0);
    }
    return "Invalid input";
  }
  public static String enemyTurn(Adventurer e, Adventurer p){
    Random rand = new Random();
    int roll = rand.nextInt(3);
    if (roll == 0) {
      return e.attack(p);
    }
    if (roll == 1) {
      return e.specialAttack(p);
    }
    if (roll == 2) {
      return e.support();
    }
    return "";
  }

  public static void main(String[]args){
    String playerName = getName();
    Ranger player = new Ranger(playerName, 50);
    Ranger opponent = new Ranger("Evil", 50);
    while (player.getHP() != 0 && opponent.getHP() != 0){
      System.out.println(turn(player, opponent));
      System.out.println(enemyTurn(opponent, player));
    }
    if (player.getHP() < opponent.getHP()) {
      System.out.println("Opponent won!");
    }
    else{
      System.out.println("Player won!");
    }  
  }
}
