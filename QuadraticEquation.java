/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab1
 * Instructor: Monisha Verma
 */
package Lab1;

public class QuadraticEquation 
{
	private double a;
	private double b;
	private double c; 
	
	//Default Constructor  
	public QuadraticEquation(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	//returns double a
	public double getA()
	{
		return a;
	}
	
	//setter for a
	public void setA(double a)
	{
		this.a = a;
	}
	
	//setter for b
	public void setB(double b)
	{
		this.b = b;
	}
	
	//setter for c
	public void setC(double c)
	{
		this.c = c;
	}
	
	//returns double b
	public double getB()
	{
		return b;
	}
	
	//returns double c
	public double getC()
	{
		return c;		
	}
	
	//returns the Discriminant
	public double getDiscriminant()
	{
		double discriminant = (Math.pow(b, 2) - (4 * a * c));
		return discriminant;
	}
	
	public double getRoot1()
	{
		double r1 = (((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
		return r1;
	}
	
	public double getRoot2()
	{
		double r2 = (((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
		return r2;
	}
	
	
}
