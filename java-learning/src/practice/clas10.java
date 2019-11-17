package practice;

import java.util.ArrayList;

public class clas10 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Lion");
        list1.add("Tiger");
        list1.add("Elephant");
        list1.add("Cow");

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Lion");
        list2.add("Tiger");
        list2.add("Cat");
        list2.add("Cow");

        boolean result = true;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(list2.get(i))) {

                result = true;
            } else {
                result = false;
                break;
            }


        }
        System.out.println("my result "  +   result);
    }
}