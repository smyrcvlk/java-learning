package NOV_23_19.stringBuffer;

public class Task1 {
    public static void main(String[] args) {

//        //Using StringBuffer create English alphabet
//        //Hint1: you can use ASCII table
//        //Hint2: loop(from 'A' to 'Z')
//        // return "ABC........XYZ" all 26 letters
//        public String getAlphabet() {
//            StringBuffer sb = new StringBuffer();
//            for (char letter = 'A'; letter <= 'Z'; letter++) {
//                sb.append(letter);
//            }
//            return sb.toString();
//        }
//
//        //Using StringBuffer get only vowels from alphabet
//
//        @Test
//        public void test() {
//            String expected = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//            String actual = getAlphabet();
//
//            Assert.assertEquals(expected, actual);
//        }

        StringBuffer sb = new StringBuffer();
        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            sb.append(alphabet);

        }
        System.out.println(sb.toString());



    }
}