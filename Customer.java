import java.util.Scanner;

class Customer {
  // class attributes
   String firstName;
   String secondName;
   int age;
   int roomNumber;

  // Constructur for the Customer class
   public Customer(String firstName, String secondName, int age,int roomNumber){
       this.firstName = firstName;
       this.secondName = secondName;
       this.age = age;
       this.roomNumber = roomNumber;
   }
   
  // saveCustomerInfo() method will save the input of the customer
   public void saveCustomerInfo() {
       System.out.println("First name: " + firstName);
       System.out.println("Second name: " + secondName);
       System.out.println("Age: " + age);
       System.out.println("Room number: " + roomNumber);
   }
}

public class Main {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       String firstName = read.nextLine();
       String secondName = read.nextLine();
       int age = read.nextInt();
       int roomNumber = read.nextInt();
       Customer customer = new Customer(firstName, secondName, age, roomNumber);
      
      
       customer.saveCustomerInfo();
   }
}
