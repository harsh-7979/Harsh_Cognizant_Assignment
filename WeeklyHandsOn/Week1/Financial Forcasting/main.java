public class main {
    public static void main(String[] args) {
        int presentValue = 500; 
        int growthRate = 2;    
        int years = 4;

        int futureValue = FinanceForcasting.forecastValue(presentValue, growthRate, years);
        System.out.printf("Future Value after %d years: %d", years, futureValue);
    }
}

