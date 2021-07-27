public class SalaryCalculator {

    private final BaseSalary baseSalary;
    private final SaturdayBonus saturdayBonus;

    public SalaryCalculator (BaseSalary baseSalary, SaturdayBonus saturdayBonus) {

        this.baseSalary = baseSalary;
        this.saturdayBonus = saturdayBonus;
    }

    public int getTotalSalary(int oneTimeBonus, int numberOfWorkingSaturdays) {
        return baseSalary.getBaseSalary() + oneTimeBonus + saturdayBonus.getSaturdayBonus() * numberOfWorkingSaturdays;
    }


}
