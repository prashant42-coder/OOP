 abstract class Animal{
    // below constructors are base constructors 
 Animal(){
System.out.println("animal is great");
 }
 //abstract void  walk();
 //public void eat()// walk is common factors on all animals hence it convert in abstract 
 { System.out.println("animal eat");
}
}
class Horse extends Animal{
    // derival constructors 
    Horse(){
        System.out.println("Horse is great ");
    }
    public void walk(){
        System.out.println(" horse walk on  4 legs");
    }
}
class Chicken extends Animal{
       public void walk(){
        System.out.println(" chicken ealk on 2 legs");
       }
}

public class abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        //horse.walk();
        //horse.eat();
        // this is {run time error } 
       // Animal animal =new Animal();
       // animal.walk();  
    }
}
