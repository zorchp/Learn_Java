import java.util.Random;

public class Rational extends Number implements Comparable<Rational> {
	private long numerator = 0;
	private long denominator = 1;

	public Rational() {
		this(0, 1);
	}

	public Rational(long numerator, long denominator) {// ctor with reduce
		long gcd = gcd(numerator, denominator);
		this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
		this.denominator = Math.abs(denominator) / gcd;
	}

	private static long gcd(long n, long d) {
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;
		for (int k = 1; k <= n1 && k <= n2; ++k) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;// traverse to find gcd
			}
		}
		return gcd;
	}

	public long getNumerator() {
		return numerator;
	}

	public long getDenominator() {
		return denominator;
	}

	public Rational add(Rational rhs) {
		long n = numerator * rhs.getDenominator() + denominator * rhs.getNumerator();
		long d = denominator * rhs.getDenominator();
		return new Rational(n, d);
	}

	public Rational subtract(Rational rhs) {
		long n = numerator * rhs.getDenominator() - denominator * rhs.getNumerator();
		long d = denominator * rhs.getDenominator();
		return new Rational(n, d);
	}

	public Rational multiply(Rational rhs) {
		long n = numerator * rhs.getNumerator();
		long d = denominator * rhs.getDenominator();
		return new Rational(n, d);
	}

	public Rational divide(Rational rhs) {
		long n = numerator * rhs.getDenominator();
		long d = denominator * rhs.getNumerator();
		return new Rational(n, d);
	}

	@Override
	public String toString() {
		if (denominator == 1) {
			return numerator + ""; // 隐式类型转换
		} else {
			return numerator + "/" + denominator;
		}
	}

	@Override
	public boolean equals(Object other) {
		if ((this.subtract((Rational) (other))).getNumerator() == 0)
			return true;
		else
			return false;
	}

	@Override
	public int intValue() {
		return (int) doubleValue();
	}

	@Override
	public float floatValue() {
		return (float) doubleValue();
	}

	@Override
	public double doubleValue() {
		return numerator * 1. / denominator;
	}

	@Override
	public long longValue() {
		return (long) doubleValue();
	}

	@Override
	public int compareTo(Rational o) {
		if (this.subtract(o).getNumerator() > 0)
			return 1;
		else if (this.subtract(o).getNumerator() < 0)
			return -1;
		else
			return 0;
	}
}