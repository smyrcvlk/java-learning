package NOV_19_19;

import static org.junit.jupiter.api.Assertions.*;

class foodTest {
    void hasButter() {
        food food = new food();
        food.oil = "butter";
        Boolean actual = food.hasButter("butter");

        assertEquals(true, actual);
    }

    @org.junit.jupiter.api.Test
    void taste() {

        //    public static void main(String[] args) {
//
//        Food pilav = new Food();
//
//        pilav.name = "Ozbek Pilavi";
//        pilav.sideDish = "Yoghurt";
//        pilav.ingredients = "meat, rice, carrot, onion, garlic, butter";
//        pilav.oil = "butter";
//        pilav.amountOfIngredients = 6;
//
//        pilav.taste();
//
//        boolean boo = pilav.hasButter("butter");
//        System.out.println(boo);
//    }
    }

}