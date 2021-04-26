package homework5;
import java.util.Scanner;

public class TestLinearEquation {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a:");
		double a = input.nextDouble();
		System.out.println("Enter b:");
		double b = input.nextDouble();
		System.out.println("Enter c:");
		double c = input.nextDouble();
		System.out.println("Enter d:");
		double d = input.nextDouble();
		System.out.println("Enter e:");
		double e = input.nextDouble();
		System.out.println("Enter f:");
		double f = input.nextDouble();
		input.close();
		LinearEquation linearEquation = new LinearEquation(a,b,c,d,e,f);
		if(linearEquation.isSolveable())
			System.out.println("x is " + linearEquation.getX() + " y is " + linearEquation.getY());
		else
			System.out.println("The equation has no solution.");
		
	}
}