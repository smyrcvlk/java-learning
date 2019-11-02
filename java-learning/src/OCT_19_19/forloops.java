package OCT_19_19;

public class forloops {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i = i + 1) {

            for (String s = ""; s.length() <= 10; s += "a") {
// "" => 0
                // ""+"a"=> "a" => 1
                // "a" + "a" => "aa" => 2
                // "aa" + "a" => "aaa" => 3

             //   int i = 123;
                System.out.println(s);
//       }

            }

        }
    }
}