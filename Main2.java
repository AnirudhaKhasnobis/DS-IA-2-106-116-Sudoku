import myMath.*;

public class Main2 {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 4);

        // Perform operations
        Fraction sum = fraction1.add(fraction2);
        Fraction difference = fraction1.subtract(fraction2);
        Fraction product = fraction1.multiply(fraction2);
        int gcd = fraction1.gcd(fraction2);
        int lcm = fraction1.lcm(fraction2);

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}
