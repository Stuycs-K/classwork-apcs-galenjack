public class ColorDemo{
  public static void main(String[]args){
    for(int r = 5; r < 256; r+=10){
      for(int b = 5; b <= 256; b+=10){
        if (b % r < 10){
          System.out.print((int) Math.random(1) * 256 );
        }
        else {
          System.out.print("\u001b[38;2;"+r+";"+ (int) Math.random() * 256  +";"+b+";7m.");
        }
      }
    }
      System.out.println();
  }
}
