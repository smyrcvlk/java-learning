package calebcurry;

public class breakstatement {
    public static void main(String[] args) {
        for (int i = 9; i>=0 ; i--) {
            for (int j = i; j >0; j--) {
                if(j==6){
                    break;

                }
                System.out.print(j + " ");
            }

            System.out.println();
        }
        
    }
}
