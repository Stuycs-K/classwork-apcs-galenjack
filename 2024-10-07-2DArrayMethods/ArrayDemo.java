import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

    //arrToString tests
    int[][] ary1 = new int[][]{{1, 2}, {3, 4}};
    String testString = Arrays.toString(ary1);
    System.out.println("testString: " + testString + "Result: " + arrToString(ary1) + "Equals? " + testString.equals(arrToString(ary1)));
    ary1 = new int[][]{{}, {4,4,4,4,4},{-5}};
    testString = Arrays.toString(ary1);
    System.out.println("testString: " + testString + "Result: " + arrToString(ary1) + "Equals? " + testString.equals(arrToString(ary1)));
    ary1 = new int[][]{{}, {}, {}};
    testString = Arrays.toString(ary1);
    System.out.println("testString: " + testString + "Result: " + arrToString(ary1) + "Equals? " + testString.equals(arrToString(ary1)));
    ary1 = new int[0][0];
    testString = Arrays.toString(ary1);
    System.out.println("testString: " + testString + "Result: " + arrToString(ary1) + "Equals? " + testString.equals(arrToString(ary1)));

    //htmlTable tests

  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String arrayS = "[";
    for(int i = 0; i < ary.length-1; i++){
      arrayS += ary[i] + ", ";
    }
    if(ary.length > 0){
      arrayS += ary[ary.length-1];
    }
    return arrayS + "]";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String newStr = "[";
    for(int i = 0; i < ary.length; i++) {
        newStr += arrToString(ary[i]);
        if (i != ary.length - 1){
            newStr += ", ";
        }
    }
    return newStr + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int n = 0; n < nums[i].length; n++) {
        if (nums[i][n] == 0) {
          sum++;
        }
      }
    }
    return sum;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int n = 0; n < nums[i].length; n++) {
        sum+=nums[i][n];
      }
    }
    return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){ 
    for (int i = 0; i < vals.length; i++) {
      for (int n = 0; n < vals[i].length; n++) {
        if (vals[i][n] < 0) {
          if (i == n) {
            vals[i][n] = 1;
          } 
          else {
            vals[i][n] = 0;
          }
        } 
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
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
  
  public static int[][] copy(int[][] nums){
    int[][] ary1 = new int[nums.length][];
    for (int i = 0; i < nums.length; i++) {
        ary1[i] = returnCopy(nums[i]);
    }
    return ary1;

  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] ary1 = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums[0].length; i++) {
      for (int n = 0; n < nums.length; n++) {
        ary1[i][n] = nums[n][i];
      }
    }
    return ary1;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String str = "<table>";
    String subStr = "";
    for (int i = 0; i < nums.length; i++) {
      subStr = "<tr>";
      for (int n = 0; n < nums.length; n++) {
        subStr += "<td>" + nums[i][n] + "</td>";
      }
      subStr += "</tr>";
      str += subStr;
    }
    return str + "</table>";
  }
}
