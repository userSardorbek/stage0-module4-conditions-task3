package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        if (number == 0) {
            System.out.println("cannot divide by zero");
        }
        if (number % 5 == 0 && number % 7 == 0) {
            System.out.println("Dividable");
        } else {
            System.out.println("Non-dividable");
        }
    }
}
