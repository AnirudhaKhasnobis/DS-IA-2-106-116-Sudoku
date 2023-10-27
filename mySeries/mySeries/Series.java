package mySeries;

public class Series {
    public double powerSeries(double x, int n) {
        double result = 1.0;
        double term = 1.0;

        for (int i = 1; i <= n; i++) {
            term *= (x * i) / i;
            result += term;
        }

        return result;
    }

    public long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public double factorialSeries(double x, int n) {
        double result = 1.0;

        for (int i = 1; i <= n; i++) {
            double numerator = Math.pow(x, i);
            long denominator = factorial(i);
            result += (numerator / denominator);
        }

        return result;
    }
}
