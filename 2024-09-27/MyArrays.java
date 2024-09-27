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
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5};
    System.out.println(arrayToString(nums));
  }
}
