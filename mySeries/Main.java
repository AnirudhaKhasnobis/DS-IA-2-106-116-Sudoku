import mySeries.Series;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Series series = new Series();

        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        double powerSeriesResult = series.powerSeries(x, n);
        double factorialSeriesResult = series.factorialSeries(x, n);

        System.out.println("(1 + " + x + ")^" + n + " using power series: " + powerSeriesResult);
        System.out.println("(1 + " + x + ")^" + n + " using factorial series: " + factorialSeriesResult);
    }
}
