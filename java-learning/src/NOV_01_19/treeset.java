package NOV_01_19;

import java.util.HashSet;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {

        HashSet<Integer> s1 =new HashSet<>();
        s1.add(null);
        s1.add(10);
        s1.add(50);
        s1.add(30);
        System.out.println("hash set" +s1);

        TreeSet<Integer>s2= new TreeSet<>();
        //s2.add(null);//cannot be provided
        s2.add(10);
        s2.add(50);
        s2.add(30);

        System.out.println("tree set " + s2);


    }
}
