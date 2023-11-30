public class Reservation {
    // instance fields 
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    // constructor for the Reservation class
    public Reservation(int count, int capacity, boolean open) {
            if (count < 1 || count > 8) {
                  System.out.println("Invalid reservation!");
            }
            guestCount = count;
  	        restaurantCapacity = capacity;
  	        isRestaurantOpen = open;
    }  

    // the confirmReservation() method checks to see:
    public void confirmReservation() {
            // if restaurantCapacity is greater or equal to guestCount AND the restaurant is open
            if(restaurantCapacity >= guestCount && isRestaurantOpen){
            // print "Reservation confirmed"
            System.out.println("Reservation Confirmed");
            // set isConfirmed to true
            isConfirmed = true;
            } else{
            // print "Reservation denied"
            System.out.println("Reservation denied");
            // set isConfirmed to false
            isConfirmed = false;
            }
    }

    // The informUser() method will always print the statement for now (will be fixed later)
    public void informUser() {
            System.out.println("Please enjoy your meal!");
    }
  
    public static void main(String[] args) {
            // creating objects for the Reservation class
            Reservation partyOfThree = new Reservation(3, 12, true);
            Reservation partyOfFour = new Reservation(4, 3, true);
            calling methods on the objects 
            partyOfThree.confirmReservation();
            partyOfThree.informUser();
            partyOfFour.confirmReservation();
            partyOfFour.informUser();
        }
}
