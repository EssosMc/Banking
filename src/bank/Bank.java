package bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
- make check system to confirm acc num input by client is correct on the system
- Look into potential storage of details
- have the user make a purchase (lottery ticket or car)
- display banking statment after purchase in .txt document
- rewrite lottery class
*/

/*
 * @author Essos
 */
public class Bank {

    public static void main(String[] args) throws IOException, InterruptedException {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        details information = new details(); // Creates object "person1" of the details class
        lottery person2 = new lottery(); // Creates object "person2" of the lottery class
        
        int Check = 0; // Int for count in do statment
        
        do {
            System.out.print("Hello Sir/Madam would you like to create an account today: ");
            String Account = br.readLine(); // Takes user input
        if (Account.equalsIgnoreCase("yes")) {
            System.out.println("Okay Sir/Madam we just need to get a few details from you");
            Thread.sleep(1000); 
            System.out.print("What is your first name: ");
            information.FName = br.readLine(); // Takes user input for First name
            Thread.sleep(1000);
            System.out.print("What is your Second name: ");
            information.SName = br.readLine(); // Takes user input for Second name
            Thread.sleep(1000);
            System.out.println("A random account number will be assigned to you, using your age");
            System.out.print("Please tell us your age: ");  // Takes user input for age name
            String Age = br.readLine();
            int CAge = Integer.parseInt(Age);
            information.GNumber(CAge); // Uses age in conjunction with math.random to make account number
            Thread.sleep(1000);
            System.out.print("Okay Sir/Madam please confirm the above Account number: ");
            String AConfirm = br.readLine(); // Takes user input for acc num
            int AConfirmed = Integer.parseInt(AConfirm);
            information.ANumber = AConfirmed;
            System.out.print("How much would you like to deposit: ");
            String ABal = br.readLine(); // Takes user input for bal amount
            int CBal = Integer.parseInt(ABal);
            information.Bal = CBal;    
            Check++;
        } else if (Account.equalsIgnoreCase("no")) {
            System.out.println("No problem Sir/Madam"); // Skips registration
            Check++;   
        } else {
            System.out.println("Sorry you have input a invalid option, please try again with yes or no"); // Error catching if user doesn't input correctly
        }
        } while (Check < 1);
        
        
        
        
        
        
        
        
    }
    
}
