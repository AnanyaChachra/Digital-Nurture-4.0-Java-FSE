public class FinancialForecast {

    // Recursive method
    static double futureValueRecursive(double value, double rate, int years) {
        if (years == 0) return value;
        return futureValueRecursive(value, rate, years - 1) * (1 + rate);
    }

    // Iterative method (optimized for large years)
    static double futureValueIterative(double value, double rate, int years) {
        for (int i = 0; i < years; i++)
            value *= (1 + rate);
        return value;
    }

    public static void main(String[] args) {
        double currentValue = 1000;   
        double growthRate = 0.10;     
        int years = 5;

        double resultRec = futureValueRecursive(currentValue, growthRate, years);
        double resultIter = futureValueIterative(currentValue, growthRate, years);

        System.out.printf("Recursive Result after %d years: %.2f\n", years, resultRec);
        System.out.printf("Iterative Result after %d years: %.2f\n", years, resultIter);
    }
}
