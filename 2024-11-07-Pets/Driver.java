//After overriding the getName method, only the birds changed the way they spoke
//The animal objects that were not birds had the same getName method
//Even though we only overrode the getName method, we changed the speak method
//The Bird b2 = new Animal(...) didn't work because the Bird is a subclass of Animal
//This lines up with the is-A relationship because bird can be used as an animal, but
//animal cannot be used as a bird


public class Driver{
  public static void main(String[]args) {

    Animal puppy = new Animal("Arf", 3, "Fido");
    puppy.speak();

    Bird bluejay = new Bird("caw caw", 5, "Mordecai", 72, "blue");
    bluejay.speak();


    Animal raccoon = new Animal("Screech", 4, "Rigby");
    raccoon.speak();

    Bird parrot = new Bird("Squeek", 6, "Floppy", 43, "rainbow");
    parrot.speak();

    //Bird duck = new Animal("Quack", 3, "Shloom");

    Animal crane = new Bird("Coo coo", 19, "Longy", 42, "black");
    crane.speak();
  }
}




===========================================


public class Bird extends Animal {
  private double height;
  private String color;


  //4.
  public Bird(String noise, int age, String name, double height, String color){
    //In order to construct the Bird you must first call the superclass constructor
    //This is done by saying: super(parameters)
    //e.g. super("Doug",10,"Squaaaak!");
    super(noise, age, name);
    this.height = height;
    this.color = color;
  }

  public String getColor() {
    return color;
  }
  public double getHeight() {
    return height;
  }

  //6.Override the speak() method.
  /*WITHOUT REPEATING CODE:
  print the following message replacing the ? with name/age/noise/color/height:
    My name is ?.
    I am ? years old.
    I say ?.
    My feathers are colored ?
    I am ? inches tall
  */
  //You can call the old method using super.speak();
  public void speak(){
    super.speak();
    System.out.println("My feathers are colored " + color + ".");
    System.out.println("I am " + height + " inches tall.");

  }



  //7:Override the getName() method so that a bid's name is "The Mighty NAME" instead of "NAME"
  //e.g. "The Mighty Polly" instead of just "Polly"
  //You can call the superclass' getName method using the syntax: super.getName()

  public String getName() {
    return "The Mighty " + super.getName();
  }

  //Step 8:In Driver.java answer: What is the difference before and after you override this method?
  //What does this tell us about methods that are overridden?
  //public String getName(){  }

  //Go back and complete steps 9 onwards.

}
