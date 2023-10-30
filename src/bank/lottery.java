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
    
    void tickets(int Amount) { // Amount of tickets to be bought
            
        do {
        if (Amount <= 5 && Amount >= 1) {
            System.out.println("Confirmed you have purchased " + Amount + " lottery tickets");
            chance = 0.25;
        } else if (Amount <= 10 && Amount >= 6) {
            System.out.println("Confirmed you have purchased " + Amount  + " lottery tickets");
            chance = 0.50;
        } else if (Amount <= 15 && Amount >= 11) {
            System.out.println("Confirmed you have purchased " + Amount + " lottery tickets");
            chance = 0.75;
        } else if (Amount <= 20 && Amount >= 16) {
            System.out.println("Confirmed you have purchased " + Amount + " lottery tickets");
                    chance = 1.00;
        } else {
            System.out.println("Sorry you cannot buy that many tickets at once, you can only buy a minimum of 1 or a maximum of 20");
        }
    } while (Amount <= 0 || Amount >= 21);
            
            
        }
    }
