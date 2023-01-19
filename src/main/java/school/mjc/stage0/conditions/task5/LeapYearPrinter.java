package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        String leap;
        if ((year % 4 == 0  && year % 100 != 0 )  || (year % 400 == 0 )) {
            leap = "leap";
        } else {
            leap = "not leap";
        }
        System.out.println(leap);
    }
}
