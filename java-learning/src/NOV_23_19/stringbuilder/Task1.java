package NOV_23_19.stringbuilder;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

// you have list of student names
// you need to return a string which is first letter of their names
public class Task1 {
    //ex: {Max, Adam, Susan} => "MAS"
    //Hint: charAt, substring
    public String getLetters(List<String> names) {
        String result = "";
        for (String name : names) {
            //1.way
            String firstLetter = name.substring(0, 1);
            result += firstLetter;

            //2.way
            // char chartAtFirst = name.charAt(0);
            // result += String.valueOf(chartAtFirst);
        }
        return result;
    }

    public String getLettersSB(List<String> names) {
        String result = "";
        for (String name : names) {
            //1.way
            String firstLetter = name.substring(0, 1);
            result += firstLetter;

            //2.way
            // char chartAtFirst = name.charAt(0);
            // result += String.valueOf(chartAtFirst);
        }
        return result;
    }


    @Test
    public void test1() {
        // GIVEN
        List<String> names = Arrays.asList("Max", "Susan", "Adam");
        // WHEN
        String expected = "MSA";
        String actual = getLetters(names);
        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // GIVEN
        List<String> names = Arrays.asList("Tuba", "Sena", "Burak");
        // WHEN
        String expected = "TSB";
        String actual = getLetters(names);
        // THEN
        Assert.assertEquals(expected, actual);
    }

}