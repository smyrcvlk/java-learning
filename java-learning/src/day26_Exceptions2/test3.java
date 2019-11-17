package day26_Exceptions2;

import org.w3c.dom.ls.LSOutput;

public class test3 {
    static ArithmeticException ae;
   public
    static void main(String[] args) {
       try {

           throw ae;


       } catch (Exception ex) {

       }
     //      System.out.println(ex.getMessage());
       }


//}
////Options:
////1. RuntineException:java.lang.ArithmeticExcetion
////2. RuntineException:NullPointerException ====answer is 2
////3. No Output
////4. RuntineException:ArithmeticExcetion
   }
