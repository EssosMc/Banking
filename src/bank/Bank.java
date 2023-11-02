package bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
- make check system to confirm acc num input by client is correct on the system
- Look into potential storage of details
- have the user make a purchase (lottery ticket or car)
- display banking statment after purchase in .txt document
- Fix while statment not calling lottery class when X is in bounds
*/

/*
 * @author Essos
 */
public class Bank {

    public static void main(String[] args) throws IOException, InterruptedException {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        details information = new details(); // Creates object "person1" of the details class
        lottery buy1 = new lottery(); // Creates object "person2" of the lottery class
        
        int Check = 0; // Int for count in do statment for input
        int Count = 0; // Int for while statment on yes or no in choice
        int CTicket = 0; //Int used to store num of tickets confirmed
        String Item = "null";
        
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
        
        do { // Start of statement to check if user would like to buy something
            System.out.print("Would you like to buy something: ");
            String Buy = br.readLine();
        if (Buy.equalsIgnoreCase("yes")) { //Check for user input to decide on course
            System.out.print("Would you like to buy a car or lottery tickets: ");
            String Choice = br.readLine();
            Item = Choice;
            Count++;
        } else if (Buy.equalsIgnoreCase("no")) {
            System.out.println("Okay skipping the purchase order");
            Count++;
        } else {
            System.out.println("Invalid response, you can only buy a car or lottery tickets");
        }
        } while (Count < 1); // End if statement
            
        do { 
        if (Item.equalsIgnoreCase("lottery tickets")) { // If user selects lottery
            System.out.println("How many lotter tickets would you like: ");
            String Amount = br.readLine();
            int CAmount = Integer.parseInt(Amount);
            CTicket = CAmount;
        } else if (Item.equalsIgnoreCase("car")) { // If user selects car
            System.out.println("Confirmed time to customise you car");
             // Car class logic here
        } else {
            System.out.println("No order placed"); 
            System.exit(0);
        }
        } while (Item == "lottery tickets" || Item == "car");
        
        do {
            if (CTicket >= 1 && CTicket <= 20) { // Logic to check that user has bought tickets within bounds
            System.out.println("Order of " + CTicket + " lottery tickets confirmed");
            buy1.tickets(CTicket); // Runs lottery class using user input
            } else {
                System.out.println("Order invalid you can only buy between 1 and 20 tickets at the moment");
                System.out.println("How many lotter tickets would you like: ");
                String TAmount = br.readLine();
                int TCAmount = Integer.parseInt(TAmount);
                CTicket = TCAmount;
            }
        } while (CTicket > 1 && CTicket >= 21); // Problem, doesn't call lottery class if amount is within bounds
         
    }
}