package Assignement;
 
import java.util.Scanner;
 
public class PasswordValidation {
 
    
    public static void validatePassword(String password) throws Exception {
        if (password.length() < 6) {
            
            throw new Exception("password should atleast 6 characters");
        }
        System.out.println("Password is valid.");
    }
 
    public static void main(String[] args) {
    	Scanner Password = new Scanner(System.in);
    	System.out.println("Enter the password");
        String password = Password.nextLine();
 
        try {
        	validatePassword(password);
        } catch (Exception e) {
            System.out.println("Password validation failed: " + e.getMessage());
        }
    }
}