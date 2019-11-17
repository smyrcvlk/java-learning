package day26_Exceptions2;

public class test2 {

        static ArithmeticException ae = new ArithmeticException();

        public static void main(String[] args) {
            throw ae;
        }
////Options:=== Answer is one
////1. RuntineException:java.lang.ArithmeticExcetion
////2. RuntineException:/ by zero
////3. RuntineException:java.lang.ArithmeticExcetion:/ by zero
////4. RuntineException:ArithmeticExcetion
//

}
