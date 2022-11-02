package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	public Fraction(int n, int d) {
		// TODO Auto-generated constructor stub
		numerator = n;
		denominator = d;
	}
	public Fraction multiply(Fraction f2) {
		int num = numerator*f2.numerator;
		int denom = denominator*f2.denominator;
		Fraction newFraction = new Fraction(num,denom);
		return newFraction.simplify();
	}
	public static int gcd(int p, int q) {
		if(p%q==0) {
			return q;
		} else {
			return gcd(q,p%q);
		}
	}
	public Fraction simplify() {
		int num = numerator/gcd(numerator,denominator);
		int denom = denominator/gcd(numerator,denominator);
		Fraction frac1 = new Fraction(num,denom);
		return frac1;
	}
	
	public Fraction add(Fraction f2) {
		int cross = denominator * f2.denominator;
		int num1 = numerator * f2.denominator;
		int num2 = f2.numerator*denominator;
		Fraction newFraction = new Fraction(num1+num2,cross);
		return newFraction.simplify();
	}
	public String reciprocal() {
		return denominator + "/" + numerator;
	}
	public String toString() {
		return numerator + "/" + denominator;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction frac1 = new Fraction(1234,23525);
		Fraction frac2 = new Fraction(1,4);
		System.out.println(frac1.add(frac2).toString());
		System.out.println(frac1.multiply(frac2).toString());
		System.out.println(frac1.reciprocal());
		System.out.println(frac1.simplify().toString());
	}

}
