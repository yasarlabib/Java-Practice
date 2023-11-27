public class Store {
  	// instance fields
  	String productType;
	double price;
  
// constructor method
public Store(String product) {
    	productType = product;
  }
  
// advertise method
public void advertise() {
	System.out.println("Selling " + productType + "!");
    	System.out.println("Come spend some money!");
  }

//greet customer method
public void greetCustomer(String customer){
	System.out.println("Welcome to the store, " + customer + "!");
  }

// increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
// main method
public static void main(String[] args) {
	Store lemonadeStand = new Store("Lemonade");
	//calling the advertise() method 3 times
	lemonadeStand.advertise();
	lemonadeStand.advertise();
	lemonadeStand.advertise();
	//calling greetCustomer() method with a parameter
	lemonadeStand.greetCustomer("Yasar");
	//increase price of product by 1.5
	lemonadeStand.increasePrice(1.5);
  }
}
