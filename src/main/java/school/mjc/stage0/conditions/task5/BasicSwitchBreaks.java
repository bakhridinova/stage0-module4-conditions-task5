package school.mjc.stage0.conditions.task5;

public class BasicSwitchBreaks {
    public static void main(String[] args) {
        int a = 20;
        switch (a) {
            case 7:
                System.out.println("seven");
            case 10:
                System.out.println("ten");
            case 30:
                System.out.println("thirty");
            default:
                System.out.println("twenty");
        }
    }
}
