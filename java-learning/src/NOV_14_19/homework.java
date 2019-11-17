package NOV_14_19;

public class homework {
    public static void main(String[] args) {
        // Write code that reverses the numbers, input 4789, output 9874


        String result="";
        String str= "sumeyra";
        char [] ch= str.toCharArray();
        for (int i = ch.length-1; i>=0 ; i--) {
            result += ch[i];


//        int number = 4789;
//        char [] arr = number.toCharArray();
//


        }
        System.out.println("reverse word : " + result.trim());
    }

}