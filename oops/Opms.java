// interface are use in java to 
interface Animal{
    int eyes=2;// value are make become stastic it's same for all animals 
 public void walk();
}
interface Herbivore{

}
class Horse implements Animal,Herbivore{
    // In horse animal and herbivor properties are present 
    // this properties called [ MULTIPLES INHERITANCE ] 
    public void walk(){
        System.out.println("horse has 4 legs");
    }
}

public class Opms {
    public static void main(String[] args) {
    Horse horse = new Horse();
    horse.walk();    
    }
}
