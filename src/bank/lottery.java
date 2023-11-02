package bank;

/*
- Implement way to return win amount to user
*/

/*
 * @author Essos
 */
public class lottery {
    
    double chance; // % chance of winning
    double win; // % needed to beat to win
    
    int AWon; // How much the user has wom
    
    void tickets(int Amount) { // Amount of tickets to be bought
            
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
        } else {
            System.out.println("Confirmed you have purchased " + Amount + " lottery tickets");
            chance = 1.00;
            AWon = 20;
        }
        
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
