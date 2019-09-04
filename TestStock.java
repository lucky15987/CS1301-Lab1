/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab1
 * Instructor: Monisha Verma
 */
package Lab1;

public class TestStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Creates object with changed symbol
        Stock stockString = new Stock("ORCL", "Oracle Corparation");
        
        Stock stockString2 = new Stock("MS", "Microsoft");
        
        Stock stockString3 = new Stock("GOOG", "Google");
 
        
        
        // Creates object with current and previous
        Stock stockDouble = new Stock(34.5, 34.35);
        
        Stock stockDouble2 = new Stock(60,30);
        
        Stock stockDouble3 = new Stock(20,10);
        
        // modify and Print the names and prices
        stockString.setAttributes("ORCL", "Oracle Corparation", 34.5, 34.35);
        System.out.print(stockString.symbol + " " + stockString.name + "\n");
        System.out.print("Current Price = " + stockDouble.currentPrice + "\n" + "Previous Price = " + stockDouble.previousClosingPrice + "\n");
        System.out.print("Price Change Percentage: " + Stock.getChangePercent() + "\n"); 
        System.out.print("\n");
        
        stockString2.setAttributes("MS", "Mircosoft", 30, 60);
        System.out.print(stockString2.symbol + " " + stockString2.name + "\n");
        System.out.print("Current Price = " + stockDouble2.currentPrice + "\n" + "Previous Price = " + stockDouble2.previousClosingPrice + "\n");
        System.out.print("Price Change Percentage: " + Stock.getChangePercent() + "\n");
        System.out.print("\n");
        
        stockString3.setAttributes("GOOG", "Google", 20, 5);
        System.out.print(stockString3.symbol + " " + stockString3.name + "\n");
        System.out.print("Current Price = " + stockDouble3.currentPrice + "\n" + "Previous Price = " + stockDouble3.previousClosingPrice + "\n");
        System.out.print("Price Change Percentage: " + Stock.getChangePercent() + "\n");
        System.out.print("\n");
	}

}
