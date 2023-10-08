public class LoggingCurrencyConverterDecorator implements CurrencyConversionStrategy {
    private CurrencyConversionStrategy decoratedStrategy;

    public LoggingCurrencyConverterDecorator(CurrencyConversionStrategy decoratedStrategy) {
        this.decoratedStrategy = decoratedStrategy;
    }

    @Override
    public double convert(double amount) {
        double convertedAmount = decoratedStrategy.convert(amount);
        System.out.println("Converted " + amount + " units with strategy: " + decoratedStrategy.getClass().getSimpleName());
        return convertedAmount;
    }
}