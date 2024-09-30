public class MyArrays {
  public static String arrayToString(int[] nums) {
    String str = "[";
    for (int i = 0; i < nums.length; i++) {
      str+=nums[i];
      if (i != nums.length - 1) {
        str+=", ";
      }
    }
    return (str + "]");
  }





  public static int[] returnCopy(int[]ary) {
    int[] newArr = new int[ary.length]; 
    if (ary.length == 0) {
      return newArr;
    }
    for (int i = 0; i < ary.length; i++) {
      newArr[i] = ary[i];
    }
    return newArr;
  }

public static int[] concatArray(int[]ary1,int[]ary2) {
  int[] newArr = new int[ary1.length + ary2.length];
  for (int i = 0; i < ary1.length; i++) {
    newArr[i] = ary1[i];
  }
  for (int i = ary1.length; i < ary1.length + ary2.length; i++) {
    newArr[i] = ary2[i - ary1.length];
  }
  return newArr;
}

//test case for return Copy
  public static void testReturn() {
    int[] arr = new int[]{103,5353,2,22};
    int[] newArr = returnCopy(arr);
    arr[3] = 21;
    System.out.println(arrayToString(arr) + arrayToString(newArr) + " Method works: " + (arrayToString(arr) != arrayToString(newArr)));
    arr = new int[] {};
    newArr = returnCopy(arr);
    arr = new int[] {1};
    System.out.println(arrayToString(arr) + arrayToString(newArr) + " Method works: " + (arrayToString(arr) != arrayToString(newArr)));
  }
  //test case for return Copy
  public static void testConcat() {
    int[] arr1 = new int[]{103,5353,2,22};
    int[] arr2 = new int[]{55555,0,2,0};
    System.out.println(arrayToString(concatArray(arr1, arr2)));
  }
  public static void main(String args[]) {
    testConcat(); 
    testReturn();
  }
 
}
