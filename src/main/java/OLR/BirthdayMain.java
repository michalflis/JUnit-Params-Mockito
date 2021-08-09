package OLR;

public class BirthdayMain {

    public static void main(String[] args) {

        Birthday birthday = new Birthday("1986-01-01");

        System.out.println(birthday.getAge());
        System.out.println(birthday.getBirthdayDayOfWeek());
        System.out.println(birthday.getBirthdayWeekOfYear());

    }
}
