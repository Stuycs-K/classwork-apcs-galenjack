import java.util.ArrayList;
public class ArrayListPractice {
  public static ArrayList<String>createRandomArray(int size) {
    String addVal = "";
    ArrayList<String> arr = new ArrayList<String>();
    for (int i = 0; i < size; i++) {
      addVal = ""+(int)(Math.random()*10);
      if (addVal.equals("0")) {
        addVal = "";
      }
      arr.add(addVal);
    }
    return arr;
  }
  public static void main(String[]args) {
    System.out.print(createRandomArray(10));
  }
}
