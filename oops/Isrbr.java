import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Isrbr {
    public static void main(String[] args)throws IOException {
        System.out.println("Enter a Number");    
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader bf=new BufferedReader(in);
     // WE CAN USE THIS >>> Scanner.sc=new Scanner(System.in);
    int num = Integer.parseInt(bf.readLine());
    // WE USE >> int num = sc.nextInt(); for parseInt we use >> nextInt();
    System.out.println(num);
    }
}
