import java.util.ArrayList;
public class ArrayListPractice {
  public static ArrayList<String>createRandomArray(int size) {
    String addVal = "";
    ArrayList<String> arr = new ArrayList<String>();
    for (int i = 0; i < size; i++) {
      addVal = ""+(int)(Math.random()*11);
      if (addVal.equals("0")) {
        addVal = "";
      }
      arr.add(addVal);
    }
    return arr;
  }

public static void replaceEmpty(ArrayList<String> original){
  for(int i = 0; i < original.size(); i++){
    if(original.get(i).equals("")){
      original.set(i, "Empty");
    }
  }
}

public static ArrayList<String> makeReversedList(ArrayList<String> original){
  ArrayList<String> ret = new ArrayList<String>();
  for(int i = original.size() - 1; i >= 0; i--){
    ret.add(original.get(i));
  }
  return ret;
}

  public static void main(String[]args) {
    ArrayList<String> test = createRandomArray(10);
    replaceEmpty(test);
    System.out.print(test);
    test = makeReversedList(test);
    System.out.print(test);
  }
}