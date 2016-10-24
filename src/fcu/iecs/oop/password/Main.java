package fcu.iecs.oop.password;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) {
		
		String password = null;
		PasswordEncode pe = new PasswordEncode();
		do
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter a password:");
			password = input.next();
			String newPassword = pe.encode(password);
			System.out.println("Encode result : " + newPassword);
		}while(!password.equals("exit"));
		
	}
}
