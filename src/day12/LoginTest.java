package day12;

public class LoginTest {
    public static void main(String[] args) {

        String userName="user123";
        String password= "pass123";

        if (userName.equals("user123") && password.equals("pass123")){
            System.out.println("LOGIN SUCCESSFUL");
        }else if (!userName.equals("user123") && password.equals("pass123")){
            System.out.println("USERNAME IS NOT CORRECT");
        }else if(userName.equals("user123") && !password.equals("pass123")) {
            System.out.println("PASSWORD IS NOT CORRECT");
        }else{
            System.out.println("USERNAME AND PASSWORD ARE BOTH WRONG!!!!");
        }








    }
}
