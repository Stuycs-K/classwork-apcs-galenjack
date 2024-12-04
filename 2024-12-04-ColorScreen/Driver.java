public class Driver{
    public static void main(String[]args){
        for (int i = 0; i < 80; i++){
            Text.color(Text.background(36));
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
        for (int i = 0; i < 80; i++){
            Text.go(30, i);
            System.out.print("@");
        }
    }
}