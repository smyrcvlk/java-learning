package NOV_23_19.stringbuilder;

public class Ex2 {

        public static void main(String[] args) {
            String simpleString = "a" + "b" + "c";
//      s1 = "a";
//      s2 = "ab";
//      s3 = "abc";

            StringBuilder sb = new StringBuilder();
            sb.append("a");
            sb.append("b");
            sb.append("c");
            String sbString = sb.toString();

            System.out.println("simpleString: " + simpleString);
            System.out.println("sbString: " + sbString);
        }
    }



    //        "prepend"+"initial point" + "append"


