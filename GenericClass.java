package generic.genericmethod;

public class GenericClass {


	// Three Integer objects initialization
		 public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
			    T max = x; // assume x is initially the largest
		
			    if (y.compareTo(max) > 0)
			      max = y; // y is the largest so far
		
			    if (z.compareTo(max) > 0)
			      max = z; // z is the largest
		
			    return max; // returns the largest object
			  } // end method maximum
		
			  public static void main(String args[]) {
			    System.out.printf("Maximum of %d, %d and %d is %d\n\n", 70, 60, 50, maximum(70, 60, 50));
			  
			  }
		}