import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;



class SalaryCalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {"0:0:3000", "1000:1:4500", "500:3:5000"}, delimiter = ':')
    void shouldCalculateTotalSalary(int oneTimeBonus, int numberOfWorkingSaturdays, int expected) {
        //given
        BaseSalary baseSalary = Mockito.mock(BaseSalary.class);
        Mockito.when(baseSalary.getBaseSalary()).thenReturn(3000);
        SaturdayBonus saturdayBonus = Mockito.mock(SaturdayBonus.class);
        Mockito.when(saturdayBonus.getSaturdayBonus()).thenReturn(500);
        SalaryCalculator salaryCalculator = new SalaryCalculator(baseSalary, saturdayBonus);

        //when
        int result = salaryCalculator.getTotalSalary(oneTimeBonus, numberOfWorkingSaturdays);

        //then
        Assertions.assertEquals(expected, result);

    }

}