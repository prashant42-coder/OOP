package Bank;
class Account{
     public String name;
     protected String email;
     private String password;
     // Encapsulation 
     // getter & setter are use 
     // get password automaticaly ek Password set karel ani ek random password creat karel 
     public String getpassword(){
        setpassword(randompass);
        return this.password;
     }
     private  String setpassword(String pass){
            this.password=pass;

         }
 }
public class bank{
    public static void main(String[] args) {
        Account account1=new Account();
        account1.name="prashant";
        account1.email="apanacollege@123gmail.com";
        account1.setpassword("abcd");
        System.out.println(account1.getpassword());
    

    }
    }
}
