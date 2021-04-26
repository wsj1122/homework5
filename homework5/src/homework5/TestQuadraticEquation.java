package homework5;
import java.util.Scanner;

public class TestQuadraticEquation {
	public static void main(String[] args){
		
		final double EPSILON = 1E-14;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the equation's a");
		double a = input.nextDouble();
		System.out.println("Enter the equation's b");
		double b = input.nextDouble();
		System.out.println("Enter the equation's c");
		double c = input.nextDouble();
		input.close();
		QuadraticEquation equation = new QuadraticEquation(a,b,c);
		
		if(equation.getDiscriminant() > EPSILON){
			System.out.println("root1 is " + equation.getRoot1() + " root2 is " + equation.getRoot2());
		}
		else if(Math.abs(equation.getDiscriminant() - 0) <= EPSILON)
			System.out.println("root is " + equation.getRoot1());
		else
			System.out.println("Ths equation has no roots.");
			
	}
}