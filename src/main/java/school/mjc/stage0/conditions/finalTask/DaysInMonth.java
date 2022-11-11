package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (month > 12 || month < 1 || year < 1) {
            System.out.println("invalid date");
        }  else {
            if (month == 2) {
                if (year == 2000 || year == 2004) {
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
            } else {
                System.out.println(30);
            }
        }
    }
}
