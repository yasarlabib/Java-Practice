public class Droid{
    // instance values 
    int batteryLevel;
    String name;

    // constructor for the Droid class
    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    // performTask method takes in a String task and prints out what the Droid is doing 
    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    // energyReport() method prints out the Droid's current energy level
    public void energyReport(){
        System.out.println("Current Energy Level: " + batteryLevel);
    }

    // The toString() method allows us to print out the object without getting a random memory address
    public String toString(){
        return "Hello, I'm the droid named " + name;
    }

    public static void main(String[] args){
        // create Droid object and call it Codey 
        Droid robot = new Droid("Codey");
        // accurately prints out due to toString() method 
        System.out.println(robot);
        // check Droid energy level
        robot.energyReport();
        // calls the performTask() method and tells it what to do using the parameter
        robot.performTask("Clean");
        // check Droid energy level
        robot.energyReport();
        // calls the performTask() method and tells it what to do using the parameter
        robot.performTask("Shop");
        // check Droid energy level
        robot.energyReport();
        // calls the performTask() method and tells it what to do using the parameter
        robot.performTask("Drive");
        // check Droid energy level
        robot.energyReport();
    }
}
