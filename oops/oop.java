
class pen{
    String name;
    String color;
    public void write(){
        System.out.println("bro write karo");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}
public class oop {
    public static void main(String[] args) {
         pen pen1 = new pen();
         pen1.color="red";
         
         pen pen2=new pen();
         pen2.color="green";
         
         pen1.printcolor();
         pen2.printcolor();

     
    }
    
}
