package Practice;

import java.util.Scanner;

class LoginException extends Exception{
    String mess;

    LoginException(String msg){
        super(msg);
    }
}
public class CustomException {
    public static void main(String[] args) {
        String user,pass;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name:");
        user = sc.nextLine();
        System.out.println("Enter your password:");
        pass = sc.nextLine();
        try{
            if(user.equals("Vijay") && pass.equals("Vijay123")){
                System.out.println("Validate login1!");
            }
            else{
                throw new LoginException("Invalid Login!!");
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
