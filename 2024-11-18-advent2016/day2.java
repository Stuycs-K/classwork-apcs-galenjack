public class day2{
  public static int solve(String[][] input) {
    int[][] padArray = {
      {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
    };
    int[] cursor = {1, 1};
    int[] values = new int[5];
    int valueCount = 0;
    for (int i = 0; i < input.length; i++) {
      for int (n = 0; n < input[i].length; n++){
        if (input[i][n].equals("L")) {
          if (cursor[0] - 1 < 0 || cursor[0] - 1 > 2) {
            values[valueCount] = padArray[cursor[0]][cursor[1]];
          }
          cursor[0] = cursor[0] - 1;
        }
        if (input[i][n].equals("R")) {
          cursor[0] = cursor[0] + 1;
        }
        if (input[i][n].equals("D")) {
          cursor[1] = cursor[1] - 1;
        }
        if (input[i][n].equals("U")) {
          cursor[1] = cursor[1] + 1;
        }

        }
      }
    }
  }
}
