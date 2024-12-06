public class Driver{
    public static void main(String[]args){
        Ranger fred = new Ranger("Fred", 50);
        Ranger bob = new Ranger("Bob", 50);
        System.out.println(fred.getHP());
        bob.attack(fred);
        System.out.println(fred.getHP());
        bob.specialAttack(fred);
        System.out.println(fred.getHP());
        System.out.println(bob.getSpecial());
    }
}