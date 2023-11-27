public class Calculator{
    // calculator class constructor
    public Calculator(){

    }

    // add method which sums up two integers
    public int add(int a, int b){
        return a+b;
    }

    // subtract method which returns the difference of two integers
    public int subtract(int a, int b){
        return a-b;
    }

    // multiply method which returns the product of two integers
    public int multiply(int a, int b){
        return a*b;
    }

    // divide method which returns the quotient of two integers
    public int divide(int a, int b){
        return a/b;
    }

    // modulo method which returns a modulo b
    public int modulo(int a, int b){
        return a%b;
    }

    // main method 
    public static void main(String[] args){
        // new object called myCalculator
        Calculator myCalculator = new Calculator();
        // calling the add method on myCalculator
        System.out.println(myCalculator.add(5,7));
        // calling the subtract method on myCalculator
        System.out.println(myCalculator.subtract(45,11));
    }
}
