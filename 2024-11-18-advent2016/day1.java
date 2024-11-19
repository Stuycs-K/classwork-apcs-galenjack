import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;


public class day1 {
  public static String[] takeInput(String filename) {
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      String[] textArray = input.nextLine().split(", ");


      input.close();
      return textArray;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return null
      ;
    }
  }
  public static void main(String[] args){
    int x = 0; int y = 0; int facing = 0;
    int[][] offset = {
      {1,0}, {0,1}, {-1,0}, {0, -1}
    };
    String[] input = takeInput("day1input.txt");
    for (int i = 0; i < input.length; i++) {
      if (input[i].charAt(0) == 'L') {
        facing+=1;
        facing = (facing + 4)%4;
        x += offset[facing][0] * Integer.parseInt(input[i].substring(1));
        y += offset[facing][1] * Integer.parseInt(input[i].substring(1));
      }
      if (input[i].charAt(0) == 'R') {
        facing -= 1;
        facing = (facing + 4)%4;
        x += offset[facing][0] * Integer.parseInt(input[i].substring(1));
        y += offset[facing][1] * Integer.parseInt(input[i].substring(1));
      }
    }
    System.out.println(Math.abs(x) + Math.abs(y));
  }
}
