package homework5;

public class QuadraticEquation {
	private double a,b,c;
	QuadraticEquation(double newA, double newB, double newC){
		a = newA;
		b = newB;
		c = newC;
	}
	public double getA(){
		return a;
	}
	public double getB(){
		return b;
	}
	public double getC(){
		return c;
	}
	public double getDiscriminant(){
		return Math.pow(b, 2) - 4 * a * c;
	}
	public double getRoot1(){
		if(this.getDiscriminant() >= 0)
			return (-b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * a);
		else
			return 0;
	}
	public double getRoot2(){
		if(this.getDiscriminant() >= 0)
			return (-b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * a);
		else
			return 0;
	}
}