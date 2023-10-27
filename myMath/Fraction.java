package myMath;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        int commonDivisor = gcd(newNumerator, newDenominator);
        return new Fraction(newNumerator / commonDivisor, newDenominator / commonDivisor);
    }

    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        int commonDivisor = gcd(newNumerator, newDenominator);
        return new Fraction(newNumerator / commonDivisor, newDenominator / commonDivisor);
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        int commonDivisor = gcd(newNumerator, newDenominator);
        return new Fraction(newNumerator / commonDivisor, newDenominator / commonDivisor);
    }

    public int gcd(Fraction other) {
        return gcd(this.numerator, this.denominator);
    }

    public int lcm(Fraction other) {
        int commonDivisor = gcd(this.numerator, this.denominator);
        return (this.numerator / commonDivisor) * other.denominator;
    }

    private void simplify() {
        int commonDivisor = gcd(this.numerator, this.denominator);
        this.numerator /= commonDivisor;
        this.denominator /= commonDivisor;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
