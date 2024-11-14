import java.util.ArrayList;
public class Driver{
  public static void main(String[]args){
    ArrayList<String> test = ArrayListPractice.createRandomArray(200000);
    ArrayList<String> test2 = ArrayListPractice.createRandomArray(250000);
    ArrayListPractice.replaceEmpty(test);
    ArrayListPractice.replaceEmpty(test2);
    System.out.println(test);
    System.out.println(test2);
    System.out.println(ArrayListPractice.mixLists(test, test2));

  }
}
