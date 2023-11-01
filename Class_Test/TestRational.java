public class TestRational {
	public static void main(String[] args) {
		// t1();
		t2();
	}

	public static void t1() {
		Rational r1 = new Rational(4, 2);
		Rational r2 = new Rational(2, 3);
		System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
		System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
		System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
		System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
		System.out.println(r2 + " is " + r2.doubleValue());
	}

	public static void t2() {
		Rational r1 = new Rational(1, 123456789);
		Rational r2 = new Rational(1, 123456789);
		Rational r3 = new Rational(1, 123456789);
		// should use BigInteger
		System.out.println("r1*r2*r3 is " + r1.multiply(r2.multiply(r3)));

	}
}
