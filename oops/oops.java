import javax.lang.model.element.Name;

class Student{
    String name;
    int age=12;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
  }
  Student(Student s2){
    this.name=s2.name;//this.name is string name indicate  
    this.age= s2.age;
  }
  Student(){   // << this is constructors 

  }
}

public class oops {
    public static void main(String[] args) {
        
            Student s1 = new Student();{
                s1.name="vijay";
                s1.age=12;
                    
                    Student s2=new Student(s1);{// s1 is copy constructure 
                        s2.printInfo();
            }
        
        }


        }
    }
