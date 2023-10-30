package bank;

/*
 * @author Essos
 */
public class lottery {
  
    double WinAmount; //Win amount
    double Multipl; //Win multiplyer
    int NoWin; //Win b4 taxes
    
    
    void amount(int Amount) //Amount won from the lotter b4 taxes
    {
        NoWin = Amount;
        WinAmount = Amount * Multipl;  //Calcualtion of lottery win after taxes ;(
    }
    
}
