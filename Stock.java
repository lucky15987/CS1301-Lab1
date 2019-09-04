/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab1
 * Instructor: Monisha Verma
 */
package Lab1;

public class Stock 
{
	 
	  String name; 
	  String symbol;
	   
	static  double previousClosingPrice;
	static double currentPrice;
	
	// Constructs new symbol
	   Stock(String newSymbol, String newName)
	   {
	        symbol = newSymbol;
	        name = newName;
	       
	   }
	// Constructs current and previous prices
	   Stock(double previousClosingPrice, double currentPrice)
	   {
	       this.currentPrice = currentPrice;
	       this.previousClosingPrice = previousClosingPrice;
	       //return TestStock(currentPrice, previousClosingPrice);
	   }
	   
	// Return price % changes
	   static double getChangePercent()
	   {
	       return (((currentPrice - previousClosingPrice) / previousClosingPrice) * 100);
	   }   
	   
	 //Set new symbol, name, prices
	   void setAttributes(String newSymbol, String newName, double newPreviousClosingPrice, double newCurrentPrice)
	   {
	       symbol = newSymbol;
	       name = newName;
	       previousClosingPrice = newPreviousClosingPrice;
	       currentPrice = newCurrentPrice;
	       
	   }
}
