public class Ranger extends Adventurer{
    private String bowName;
    private String special;
    private int specialBuff = 0;
    private int specialMax = 0;
    public Ranger(String name){
        super(name);
        bowName = "Longbow";
        special = "Aim potion";
        specialBuff = 1;
        specialMax = 10;
        
    }
    public Ranger(String name, int hp){
        super(name, hp);
        bowName = "Longbow";
        special = "Aim potion";
        specialBuff = 1;
        specialMax = 10;
    }
    public static String getSpecialName(){
        return special;
    }
    public static int getSpecial(){
        return specialBuff;
    }
    public static void setSpecial(int n){
        specialBuff = n;
        
    }
    
    public static int getSpecialMax(int n){
        specialMax = n;
    }
}