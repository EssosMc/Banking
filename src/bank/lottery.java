package bank;

/*
- Implement math on winning
- Implement math for returning money to user
*/

/*
 * @author Essos
 */
public class lottery {
    
    double chance; // % chance of winning
    double win; // % needed to beat to win
    
    int AWon; // How much the user has won
    
    void tickets(int Amount) { // Amount of tickets to be bought
            
        do { // Logic for buying tickets & assigning chance amount
        if (Amount <= 5 && Amount >= 1) {
            System.out.println("Confirmed you have purchased " + Amount + " lottery tickets");
            chance = 0.25;
            AWon = 5;
        } else if (Amount <= 10 && Amount >= 6) {
            System.out.println("Confirmed you have purchased " + Amount  + " lottery tickets");
            chance = 0.50;
            AWon = 10;
        } else if (Amount <= 15 && Amount >= 11) {
            System.out.println("Confirmed you have purchased " + Amount + " lottery tickets");
            chance = 0.75;
            AWon = 15;
        } else if (Amount <= 20 && Amount >= 16) {
            System.out.println("Confirmed you have purchased " + Amount + " lottery tickets");
            chance = 1.00;
            AWon = 20;
        } else {
            System.out.println("Sorry you cannot buy that many tickets at once, you can only buy a minimum of 1 or a maximum of 20");
        }
    } while (Amount <= 0 || Amount >= 21);
        
        int Num1 = (int)(Math.random() * 100); // Random number between 0 & 99
        Num1 = Num1 + 1;
        
        win = Amount / Num1; //Calc % win threshold
        
        if (win > chance) {
            System.out.println("Congratualtions you have a winning ticket");
            System.out.println("You have won £" + AWon);
        } else if (win < chance) {
            System.out.println("Sorry you don't have a winning ticket there");
        } else {
            System.out.println("Sorry you don't have a winning ticket here");
        }      
        }
    }
