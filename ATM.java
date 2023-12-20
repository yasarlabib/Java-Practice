public class ATM{
    // static variables
    public static int totalMoney = 0;
    public static int numATMs = 0;
  
    // instance variables
    public int money;
  
    // constructor for the ATM class 
    public ATM(int inputMoney){
        this.money = inputMoney;
    }
  
    // withdraw() method lets user withdraw money from the ATM
    public void withdrawMoney(int amountToWithdraw){
        if(amountToWithdraw <= this.money){
            this.money -= amountToWithdraw;
        }
    }
  
    // main method 
    public static void main(String[] args){
        // creating two ATMs
        ATM firstATM = new ATM(1000);
        ATM secondATM = new ATM(500);
    
        // printing your static variable in three different ways here
        System.out.println(ATM.totalMoney); // prints 0
        System.out.println(firstATM.totalMoney); //prints 0
        System.out.println(secondATM.totalMoney); // prints 0
    }
}
