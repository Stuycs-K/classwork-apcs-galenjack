public class Ranger extends Adventurer{
    private String bowName;
    private String special;
    private int specialBuff = 5;
    private int specialMax = 0;
    public Ranger(String name){
        super(name);
        bowName = "Longbow";
        special = "aim potion";
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
    public String getSpecialName(){
        return special;
    }
    public int getSpecial(){
        return specialBuff;
    }
    public void setSpecial(int n){
        specialBuff = n;
        
    }
    
    public int getSpecialMax(){
        return specialMax;
    }
    public String attack(Adventurer other) {
        other.applyDamage(1 + specialBuff);
        return "Attacked " + other.getName() + " dealing " + 1 + specialBuff + " damage.";
    }

  //heall or buff the target adventurer
    public String support(Adventurer other) {
        other.setHP(other.getHP() + 1 + specialBuff);
        return "";
    }

  //heall or buff self
    public String support() {
        this.setHP(this.getHP() + specialBuff + 1);
        return this.getName() + " restored " + specialBuff + 1 + " health. You now have " + this.getHP() + " health.";
    }

  //hurt or hinder the target adventurer, consume some special resource
    public String specialAttack(Adventurer other) {
        int temp = specialBuff;
        other.applyDamage(specialBuff * 5);
        this.setSpecial(0);
        return "Dealt " + temp * 5 + " damage using " + special +  ". Special is once again at 0";
        
    }



    
}