package NOV_24_19;

// write a program that will count every time when you create an object

// HINT: create class Counter with attribute [int count = 0]
// increment value of count in default constructor of Counter

import org.w3c.dom.ls.LSOutput;

class Counter{
    public static int count = 0;

    public Counter() {
        count++;
        System.out.println("Count is: " + count);
    }
}

public class Task1 {
    public static void main(String[] args) {
        Counter c1 = new Counter();

        Counter c2 = new Counter();

        Counter c3=new Counter();

    }
}











