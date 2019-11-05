package NOV_02_19;

import java.util.HashSet;

public class settask5 {
    public static void main(String[] args) {
        //14. Write a Java program to check if a string in hash set
        // for ex: ["apple", "red", "green"]
        // if there is red => has red
        // else => dont have it

        HashSet<String> set = new HashSet<String>();

        set.add("apple");
        set.add("red");
        set.add("green");

        if(set.contains("red")){
            System.out.println("has red");

        }else {
            System.out.println("dont have it");

        }
    }
}
