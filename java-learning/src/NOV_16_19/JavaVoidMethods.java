package NOV_16_19;

public class JavaVoidMethods {
    // return for void methods
    public static void buyStuffFromStore() {
        boolean dontHaveMilk = true;
        if (dontHaveMilk) {
            System.out.println("I'll to go to other store");
            return;
        }

        System.out.println("buy milk");
        System.out.println("buy bread");
        System.out.println("buy water");
    }

}
