public class FinanceForcasting {
    public static int forecastValue(int presentValue, int rate, int years) {
        if (years == 0) {
            return presentValue; 
        }
        return forecastValue(presentValue, rate, years - 1) * (1 + rate);
    }
}
