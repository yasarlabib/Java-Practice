public class SavingsAccount{
  
    public String owner;
    public int balanceDollar;
    public double balanceEuro;

    // constructor for the SavingsAccount class
    public SavingsAccount(String owner, int balanceDollar){
        this.owner = owner;
        this.balanceDollar = balanceDollar;
        this.balanceEuro = balanceDollar * 0.85;
    }
  
    public void addMoney(int balanceDollar){
        // before making updating balance
        System.out.println("Adding " + balanceDollar + " dollars to the account.");
        // updaing balance 
        this.balanceDollar += balanceDollar;
        // after updating the balance 
        System.out.println("The new balance is " + this.balanceDollar + " dollars.");
    }
  
    public static void main(String[] args){
        SavingsAccount zeusSavingsAccount = new SavingsAccount("Zeus", 1000);
        // Making a call to addMoney() to test method
        zeusSavingsAccount.addMoney(2000);
    }
}
