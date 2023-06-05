 // INTERFACE keyword 
 class Student{
    String name;
     static String college;// static keyword define  all can access the data of class 
     //  for all student college name is common for all student 
     public static void changeCollege(){
        college="new college";  // college name change into "new college"
     } 
 }

public class College {
    public static void main(String[] args) {
        Student.college="SMT indira gandhi college";// we can direct write class + string = 'print jo karana chate ho '
        Student student1=new Student();
        student1.name="sujay";  
        System.out.println(student1.college);     
    }

}