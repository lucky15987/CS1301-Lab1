/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab1
 * Instructor: Monisha Verma
 */
package Lab1;

public class TotalArea {
	/** Main method */
	  public static void main(String[] args) {
	    // Declare circleArray
	    CircleWithPrivateDataFields[] circleArray;

	    // Create circleArray
	    circleArray = createCircleArray();

	    // Print circleArray and total areas of the circles
	    printCircleArray(circleArray);
	    minMax(circleArray);
	    
	    
	  }

	  /** Create an array of Circle objects */
	  public static CircleWithPrivateDataFields[] createCircleArray() {
	    CircleWithPrivateDataFields[] circleArray = 
	      new CircleWithPrivateDataFields[5];

	    for (int i = 0; i < circleArray.length; i++) {
	      circleArray[i] = 
	        new CircleWithPrivateDataFields(Math.random() * 100);
	    }

	    // Return Circle array
	    return circleArray;
	  }

	  /** Print an array of circles and their total area */
	  public static void printCircleArray(
	      CircleWithPrivateDataFields[] circleArray) {
	    System.out.printf("%-30s%-15s\n", "Radius", "Area");
	    for (int i = 0; i < circleArray.length; i++) {
	      System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),
	        circleArray[i].getArea());
	    }

	    System.out.println("-----------------------------------------");

	    // Compute and display the result
	    System.out.printf("%-30s%-15f\n", "The total areas of circles is",
	      sum(circleArray));
	  }

	  /** Add circle areas */
	  public static double sum(
	      CircleWithPrivateDataFields[] circleArray) {
	    // Initialize sum
	    double sum = 0;

	    // Add areas to sum
	    for (int i = 0; i < circleArray.length; i++)
	      sum += circleArray[i].getArea();

	    return sum;
	    }
	  
	  /** Determines the smallest and largest circles */
	  public static void minMax(CircleWithPrivateDataFields[] circleArray)
	  {
		 //circleArray[0].getRadius() = 
		  int minValue = Integer.MAX_VALUE;
		  int maxValue = Integer.MIN_VALUE;
			
			for(int i = 0; i < circleArray.length; i++)
			{
				if(circleArray[i].getRadius() < minValue)
				{
					minValue = (int) circleArray[i].getRadius();
					
				}
			}
			for(int j = 0; j < circleArray.length; j++)
			{
				if(circleArray[j].getRadius() > maxValue)
				{
					maxValue = (int)circleArray[j].getRadius();
				}
				
			}
			System.out.println("The smallest circle has radius: " + minValue);
			System.out.println("The largest circle has radius: " + maxValue);
	  }
}
