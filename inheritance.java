// single level 
class shape{
    public void area (){
        System.out.println("area display");
    }
}
class Triangle extends shape{
public void area(int l,int h){
    System.out.println(1/2*l*h);
}
}
// multiple  level 
// in multiple level dervid class has conncet with next class { triangle & equilateral triangle}
class Equilateraltriangle extends Triangle{
public void area(int l,int h){
    System.out.println(1/2*l*h);
}
}
// hierarchical inheritance
class circle extends shape{
public void area(int r){
     System.out.println((3.14)*r*r);
}
}
public class inheritance {
public static void main(String[] args) {

}    
}
