 class Student{
    String name;
    int age=56;
    // many print void are present those are work for only single out put  
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age ){
        System.out.println(age);
    }
    public void printInfo( String name,int age){
        System.out.println(name +""+ age);
    }

 }
// pholymorphism has 2 types overloading & overriding 
// overloading means same name FUNCTION  are create in one CLASS 
public class polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="sapana";
        s1.age=30;
        s1.printInfo( s1.name,s1. age);
    }
}
