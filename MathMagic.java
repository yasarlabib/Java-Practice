public class Magic {
	public static void main(String[] args) {

    /*
    This program prints out 3, not matter what your original number is. Magic!
    */

    //orginal number
		int myNumber = 21; //can be any number
    //step 1
    int stepOne = myNumber * myNumber;
    //step 2
    int stepTwo = stepOne + myNumber;
    //step 3
    int stepThree = stepTwo/myNumber;
    //step 4
    int stepFour = stepThree + 17;
    //step 5
    int stepFive = stepFour - myNumber;
    //step 6
    int stepSix = stepFive/6;
    //print it out 
    System.out.println(stepSix);

	}
}
