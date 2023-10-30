package bank;

/*
 * @author Essos
 */
public class details {
    
    String FName; //Account holder name
    String SName; //Account holder surname
    int ANumber; //Account holder associated number
    int Bal; //Account holder balance

    void GNumber(int age) {
        
        String Cage = String.valueOf(age);
        String FNum;
        String SNum;
        int Num3;
    
        int Num1 = (int)(Math.random() * 99); //Gens random numb between 0 & 98
        Num1 = Num1 + 1; //Adds 1 to that num
        FNum = String.valueOf(Num1);
         
        int Num2 = (int)(Math.random() * 99); //Gens random numb between 0 & 98
        Num2 = Num2 + 1; //Adds 1 to that num
        SNum = String.valueOf(Num2);
         
        Num3 = (int)(Math.random() * 3 ); //Gens random numb between 0 & 2
        Num3 = Num3 + 1; //Adds 1 to that num
         
        if (Num3 == 1) {
            String A1 = FNum + SNum + Cage; // Creates random acc num
            System.out.println("Your Account Number is " + A1);
        } else if (Num3 == 2) {
            String A2 = SNum + Cage + FNum;  // Creates random acc num
            System.out.println("Your Account Number is " + A2); 
        } else {
            String A3 = Cage + FNum + SNum;  // Creates random acc num
            System.out.println("Your Account Number is " + A3);
            }   
    }
}