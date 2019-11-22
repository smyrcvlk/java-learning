package NOV_21_19;

public class exception2 {
    public static void main(String[] args) {
        String[] arr = {"hi", "Hello", null};

        try{
        for (int i = 0; i < arr.length; i++) {
            char[] c = arr[i].toCharArray();
            System.out.println(c[0]);
        }
           }catch (Exception e){
               System.out.println("null pointer exception");
               e.getStackTrace();
           }

        }
    }

//for (String word : arr) {
//            try {
//                System.out.println(word.substring(0, 1));
//            }catch (Exception ex){
//                System.out.println("We have non existing string");
//            }