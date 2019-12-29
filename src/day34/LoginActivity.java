package day34;

public class LoginActivity {
    public static void main(String[] args) {

        loginVoid("users","acb23");

boolean result=loginReturn("user","abc123");
        System.out.println("result = " + result);



    }
   

    public static void loginVoid(String userName,String password){

        if(userName.equals("user") && password.equals("abc123")){
            System.out.println("Log In Successful");
        }else{
            System.out.println("Log In Failed");
        }



    }
    public static boolean loginReturn(String userName, String password){
        if(userName.equals("user")&& password.equals("abc123")){

            return true;
        }
        return false;
    }


}
