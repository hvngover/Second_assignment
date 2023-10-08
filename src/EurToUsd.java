public class EurToUsd implements CurrencyConversionStrategy {
    private static final double CONVERSION_RATE = 1.05;

    @Override
    public double convert(double amount) {
        return amount * CONVERSION_RATE;
    }
}