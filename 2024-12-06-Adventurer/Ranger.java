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
        return specialMax;
    }
    public static String attack(Adventurer other) {
        other.applyDamage(1 + specialBuff);
    }

  //heall or buff the target adventurer
    public static String support(Adventurer other) {
        other.setHP(other.getHP() + 1 + specialBuff);
    }

  //heall or buff self
    public static String support() {
        this.setHP(this.getHP() + specialBuff + 1);
    }

  //hurt or hinder the target adventurer, consume some special resource
    public abstract String specialAttack(Adventurer other) {
        other.applyDamage(specialBuff * 5);
        this.setSpecial(0);
    }



    
}