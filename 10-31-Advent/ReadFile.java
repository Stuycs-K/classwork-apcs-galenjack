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
        if (Math.max(Math.max(sides[0],sides[1]),sides[2]) < sum/2) count++;
      }

      input.close();
      return count;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static void main(String[] args) {
    System.out.println(countTrianglesA("inputTri.txt"));
  }

}