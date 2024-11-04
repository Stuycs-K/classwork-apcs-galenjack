// I worked with Galen

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class TriangleTester {

  public static int countTrianglesA(String filename) {
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);

      int count = 0;
      while(input.hasNextLine()) {
        String line = input.nextLine();
        Scanner lineScan = new Scanner(line);
        int[] sides = new int[3];
        sides[0] = lineScan.nextInt();
        sides[1] = lineScan.nextInt();
        sides[2] = lineScan.nextInt();
        int sum = sides[0] + sides[1] + sides[2];
        if (2 * Math.max(Math.max(sides[0],sides[1]),sides[2]) < sum) count++;
      }

      input.close();
      return count;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }
  public static int countTrianglesB(String filename){
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int count = 0;
      int index = 0;
      int sum = 0;
      int[][] sides = new int[3][3];
      while (input.hasNextLine()) {
        String line = input.nextLine();
        Scanner lineScan = new Scanner(line);
        sides[index][0] = lineScan.nextInt();
        sides[index][1] = lineScan.nextInt();
        sides[index][2] = lineScan.nextInt();
        if (index == 2) {
          index = 0;
          sum = sides[0][0] + sides[1][0] + sides[2][0];
          if (2 * Math.max(Math.max(sides[0][0],sides[1][0]),sides[2][0]) < sum) count++;
          sum = sides[0][1] + sides[1][1] + sides[2][1];
          if (2 * Math.max(Math.max(sides[0][1],sides[1][1]),sides[2][1]) < sum) count++;
          sum = sides[0][2] + sides[1][2] + sides[2][2];
          if (2 * Math.max(Math.max(sides[0][2],sides[1][2]),sides[2][2]) < sum) count++;
          sides = new int[3][3];
        }
        else {
          index++;
        }
      }
        input.close();
        return count;
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static void main(String[] args) {
    System.out.println(countTrianglesA("inputTri.txt"));
    System.out.println(countTrianglesB("inputTri.txt"));
  }

}
