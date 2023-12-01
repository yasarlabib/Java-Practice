public class CarLoan {
    public static void main(String[] args) {
        // user's car loan amount 
        int carLoan = 10000;
        // length of the loan in years
        int loanLength = 3;
        // interest rate for the car loan 
        int interestRate = 5;
        //down payment amount the user put 
        int downPayment = 2000;
        // if the loan length or the interest rate isn't greater than or equal to zero
        if(loanLength <= 0 || interestRate <= 0){
            // this would not be a valid car loan 
            System.out.println("Error! You must take out a valid car loan.");
        } 
        // if the downPayment put down is greater than the amount of the car loan 
        else if(downPayment >= carLoan){
            // the car can just be paid off in full
            System.out.println("The car can be paid in full.");
        } 
        //if neither of those scenarios 
        else{
            // set the remaining balance
            int remainingBalance = carLoan - downPayment;
            // how many months the user has to pay 
            int months = loanLength * 12;
            // find the mongthly balance before interest
            int monthlyBalance = remainingBalance/months;
            // calculate how much interest the user must pay
            int interest = (monthlyBalance * interestRate)/100;
            // get the final monthly payment the user has to pay 
            int monthlyPayment = monthlyBalance + interest;
            // how much the user has to pay per month
            System.out.println(monthlyPayment);
        }

    }
}
