public class CurrencyCalculator {

    private final ExternalCurrencyService externalCurrencyService;

    public CurrencyCalculator (ExternalCurrencyService externalCurrencyService) {
        this.externalCurrencyService = externalCurrencyService;
    }

    public double getSellingValue (double value, Currency currency) {
        return value * externalCurrencyService.getSellingRate(currency);

    }

    public double getBuyingValue (double value, Currency currency) {
        return value * externalCurrencyService.getBuyingRate(currency);

    }

}
