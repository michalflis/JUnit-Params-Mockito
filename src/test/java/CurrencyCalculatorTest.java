import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyCalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {"5:EUR:23", "5:USD:19.5", "5:GBP:26.5"}, delimiter = ':')
    void shouldGetSellingValue(double input, Currency currency, double expected) {
        //given
        ExternalCurrencyService externalCurrencyService = Mockito.mock(ExternalCurrencyService.class);
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(externalCurrencyService);
        Mockito.when(externalCurrencyService.getSellingRate(Currency.EUR)).thenReturn(4.6);
        Mockito.when(externalCurrencyService.getSellingRate(Currency.USD)).thenReturn(3.9);
        Mockito.when(externalCurrencyService.getSellingRate(Currency.GBP)).thenReturn(5.3);

        //when
        double result = currencyCalculator.getSellingValue(input, currency);

        //then
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"2:EUR:8.8", "2:USD:7.6", "2:GBP:10.2"}, delimiter = ':')
    void shouldGetBuyingValue(double input, Currency currency, double expected) {
        //given
        ExternalCurrencyService externalCurrencyService = Mockito.mock(ExternalCurrencyService.class);
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(externalCurrencyService);
        Mockito.when(externalCurrencyService.getBuyingRate(Currency.EUR)).thenReturn(4.4);
        Mockito.when(externalCurrencyService.getBuyingRate(Currency.USD)).thenReturn(3.8);
        Mockito.when(externalCurrencyService.getBuyingRate(Currency.GBP)).thenReturn(5.1);

        //when
        double result = currencyCalculator.getBuyingValue(input, currency);

        //then
        Assertions.assertEquals(expected, result);
    }

}