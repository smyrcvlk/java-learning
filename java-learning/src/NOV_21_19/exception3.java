package NOV_21_19;

public class exception3 {
    public static Integer covertToInt(String number) {
        return Integer.valueOf(number);
    }

    public static void main(String[] args) {
        // fix the code
        try{
        System.out.println(covertToInt("one"));
        System.out.println(covertToInt("2"));
        System.out.println(covertToInt("-1"));

    }catch(Exception e){
            System.out.println("format exception");
        }
        }

}
