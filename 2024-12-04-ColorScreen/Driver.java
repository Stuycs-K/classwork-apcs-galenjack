import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.*;
public class Driver{
    public static void main(String[]args){
        border();
        Text.go(2,2);
        printArray();
        
        Text.color(Text.background(36));
        for (int i = 2; i < 80; i++){
            
            Text.go(3, i);
            System.out.print("*");
        }
        Text.color(0);
        printAscii();



        Text.go(31,0);
    }

    public static void sleep(int milli){
      try{
              Thread.sleep(milli);
      }catch(Exception e){
      }
}
    
    public static void printAscii() {
    try{
      File file = new File("ascii.txt");
      Scanner input = new Scanner(file);

      int count = 5;
      while(input.hasNextLine()) {
        Text.go(count,3);
        String line = input.nextLine();
        Scanner lineScan = new Scanner(line);
        
        System.out.print(line);
        count++;
        sleep(30);
      }

      input.close();

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");

    }
  }





    public static void border(){
        Text.color(Text.background(36));
        for (int i = 0; i < 80; i++){
            Text.go(0, i);
            System.out.print("@");
        }
        for (int i = 0; i < 30; i++){
            Text.go(i, 0);
            System.out.print("@");
        }
        for (int i = 0; i < 30; i++){
            Text.go(i, 80);
            System.out.print("@");
        }
        for (int i = 0; i < 81; i++){
            Text.go(30, i);
            System.out.print("@");
        }
    }

    public static void printArray(){
        int[] arr = new int[3];
        Random rand = new Random();
  
        
        for(int i = 0; i < 3; i++) {
            arr[i] = rand.nextInt(100);
        }
        for (int i = 0; i < 3; i++) {
            Text.go(2, 2 + i * 38);
            Text.color(0);
            if (arr[i] < 25) {
                Text.color(31);
            }
            if (arr[i] > 75) {
                Text.color(32);
            }
        
            System.out.print(arr[i]);
        }

    }
}