package NOV_23_19.trycatch;

public class ATM {
    public  int withdraw(int yourBalance, int moneyYouWant){
        if(yourBalance<moneyYouWant){
            RuntimeException haveNomoney =new RuntimeException(" have nor enough money in balance");
            throw haveNomoney;
        }
        yourBalance=yourBalance-moneyYouWant;

        return moneyYouWant;
    }

    public static void main(String[] args) {
        ATM atm=new ATM();

        try {
            atm.withdraw(10, 100);
        } catch (Exception ex) {
            System.out.println("I'm in catch body");
        } finally {
            System.out.println("I'm in finally body");
        }


        System.out.println("Some code after withdraw");
    }


}

