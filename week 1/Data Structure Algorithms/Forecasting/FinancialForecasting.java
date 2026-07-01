import java.util.Scanner;
public class FinancialForecasting {

    // Recursion
    public static double futureValue(double presentValue, double growthRate, int years) {

        if (years == 0) {
            return presentValue;
        }
        // Recursive Case
        return futureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Present Value: ");
        double presentValue = sc.nextDouble();
        System.out.print("Enter Annual Growth Rate (in %): ");
        double growthRate = sc.nextDouble() / 100;
        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();

        double result = futureValue(presentValue, growthRate, years);
        System.out.printf("Future Value after %d years = %.2f", years, result);

        sc.close();
    }
} 
    

