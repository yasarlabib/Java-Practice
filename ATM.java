public class ATM{
    // static variables
    public static int totalMoney = 0;
    public static int numATMs = 0;
  
    // instance variables
    public int money;
  
    // constructor for the ATM class 
    public ATM(int inputMoney){
        this.money = inputMoney;
        // static variable keeps track of how many ATMs there are
        numATMs++;
        // static variable keeps track of total money in the system 
        totalMoney += inputMoney;
    }
  
    // withdraw() method lets user withdraw money from the ATM
    public void withdrawMoney(int amountToWithdraw){
        if(amountToWithdraw <= this.money){
            this.money -= amountToWithdraw;
            // removes money from the static variable totalMoney
            totalMoney -= amountToWithdraw;
        }
    }

    // averageMoney() is a static method 
    public static void averageMoney(){
        System.out.println(totalMoney/numATMs); 
        // System.out.println(this.money); // would cause an error because the variable is non-static 
    }
  
    // main method 
    public static void main(String[] args){
        // printing number of ATMs before creating new ATMs
        System.out.println("Total number of ATMs: " + ATM.numATMs); 
        // creating two ATMs
        ATM firstATM = new ATM(1000);
        ATM secondATM = new ATM(500);
        // printing number of ATMs after creating new ATMs
        System.out.println("Total number of ATMs: " + ATM.numATMs); 

        // printing total money in the system before withdrawing money
        System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);  
        // withdrawing money using the withdrawMoney() method
        firstATM.withdrawMoney(500);
        secondATM.withdrawMoney(200);
        // printing total money in the system after withdrawing money
        System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);    
    
        // printing your static variable in three different ways here
        System.out.println(ATM.totalMoney); // prints 800
        System.out.println(firstATM.totalMoney); // prints 800
        System.out.println(secondATM.totalMoney); // prints 800

        // calling a static method 
        ATM.averageMoney();
    }
}
