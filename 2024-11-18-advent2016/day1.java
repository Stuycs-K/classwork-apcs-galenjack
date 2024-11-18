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
    int sumR = 0;
    int sumL = 0;
    int rDir = 1;
    int lDir = 1;
    String[] input = takeInput("day1input.txt");
    System.out.println(Arrays.toString(takeInput("day1input.txt")));
    for (int i = 0; i < input.length; i++) {
      if (input[i].charAt(0) == 'L') {
        sum = sum - Integer.parseInt(input[i].substring(1));
      }
      if (input[i].charAt(0) == 'R') {
        sum = sum + Integer.parseInt(input[i].substring(1));
      }
    }
    System.out.println(Math.abs(sum));
  }
}
