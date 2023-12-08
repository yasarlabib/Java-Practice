public class FizzBuzz{
    public static void main(String[] args){
        // printing numbers 1-100
        for(int i = 1; i <= 100; i++){
            // if the number is both divisble by 3 and 5, print "FizzBuzz"
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } 
            // if the number is divisble by 3, print "Fizz"
            else if(i % 3 == 0){
                System.out.println("Fizz");
            } 
            // if the number is divisble by 5, print "Buzz"
            else if(i % 5 == 0){
                System.out.println("Buzz");
            } 
            // else print out the number 
            else{
                System.out.println(i);
            }
        }
    }
}
