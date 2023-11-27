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

// greet customer method
public void greetCustomer(String customer){
	System.out.println("Welcome to the store, " + customer + "!");
  }

// increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }

// get price with tax method
  public double getPriceWithTax(){
    double totalPrice = price + price*0.08;
    return totalPrice;
  }

// toString method for the Store class 
public String toString(){
    return "This store sells " + productType + " at a price of " + price + ".";
  }
  
// main method
public static void main(String[] args) {
	// creating two objects, which are both stores 
	Store lemonadeStand = new Store("Lemonade", 3.75);
	Store cookieShop = new Store("Cookies", 5);
	// calling the advertise() method 3 times
	lemonadeStand.advertise();
	lemonadeStand.advertise();
	lemonadeStand.advertise();
	// calling greetCustomer() method with a parameter
	lemonadeStand.greetCustomer("Yasar");
	// increase price of product by 1.5
	lemonadeStand.increasePrice(1.5);
	// sets the price of lemonade including tax
	double lemonadePrice = lemonadeStand.getPriceWithTax();
	// printing the information for both of the stores 
	System.out.println(lemonadeStand);
    	System.out.println(cookieShop);
  }
}
