package generic.genericmethod;

public class GenericClass {

	public static void main(String[] args) {
		System.out.println("program to find maximum number among three numbers");
	// Three Integer objects initialization
		Integer firstNumber = 200 ;
		Integer secondNumber = 100 ;
		Integer thirdNumber = 150 ;

		Integer max = firstNumber ;

		// using compareTo method
		if(secondNumber.compareTo(max) > 0) {
			max = secondNumber;
		}
		if(thirdNumber.compareTo(max) > 0) {
			max = thirdNumber ;
		}

		// printing the maximum among three integer objects
		System.out.println("Maximum number is "+max);
	}

}