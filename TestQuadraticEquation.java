/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab1
 * Instructor: Monisha Verma
 */
package Lab1;

import java.util.Scanner;

public class TestQuadraticEquation {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double dis;
		//creates Scanner input
		Scanner input = new Scanner(System.in);
		
		//Enter "a" variable
		System.out.print("Enter a variable (ex: x.xx): ");
		double a = input.nextDouble();
		
		//Enter "b" variable
		System.out.print("Enter b variable (ex: x.xx): ");
		double b = input.nextDouble();
		
		//Enter "c" variable
		System.out.print("Enter c variable (ex: x.xx): ");
		double c = input.nextDouble();
		
		//Creates Quatratic Equation Objection
		QuadraticEquation quads = new QuadraticEquation(a,b,c);
		
		
		if (quads.getDiscriminant() < 0)
		{
			System.out.println("The Equation has no roots [Cannot have a negative discriminant]" );
		}
		else
		{
			System.out.println("Discriminant: " + quads.getDiscriminant());
			System.out.println("r1: " + quads.getRoot1());
			System.out.println("r2: " + quads.getRoot2());
		}
	}

}
