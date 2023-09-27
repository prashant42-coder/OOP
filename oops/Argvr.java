// array Concept is present 
class Cal{
public int add(int...n){// it like array {1,3,3,4,6,5,8,0} 
        int sum=0;
        for(int i:n){
            sum = sum+i;
        }
        return sum;
    }
}


public class Argvr {
    public static void main(String[] args) {
        Cal obj=new Cal();
        System.out.println(obj.add(1,3,3,4,6,5,8,0));
    }
}
