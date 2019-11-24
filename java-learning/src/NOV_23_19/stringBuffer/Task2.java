package NOV_23_19.stringBuffer;

import org.junit.Assert;
import org.junit.Test;

public class Task2 {
    //Using StringBuffer create English alphabet
    //Hint1: you can use ASCII table
    //Hint2: loop(from 'A' to 'Z')
    // return "ABC........XYZ" all 26 letters
    public String getAlphabet() {
        StringBuffer sb = new StringBuffer();
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            sb.append(letter);
        }
        return sb.toString();
    }

    //Using StringBuffer get only vowels from alphabet
    public String getVowels () {
        StringBuffer alphabet = new StringBuffer();
        for (char i = 'A'; i <= 'Z'; i++) {
            if (i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U') {
                alphabet.append(i);
            }
        }
        String result = alphabet.toString();
        return result;
    }

    @Test
    public void test() {
        String expected = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String actual = getAlphabet();

        Assert.assertEquals(expected, actual);
    }


}
