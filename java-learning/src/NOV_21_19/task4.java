package NOV_21_19;


class   Ssnoffice {
    public String privateInfo() {
        return "ssn number";
    }


    public int publicInfo() {
        int var = 2343445;
        int publicInfo = 2343445 + var;

        return publicInfo;
    }
}
public class task4 {
    // create class
    // create private method
    // use public method to access to private method
    public static void main(String[] args) {
        Ssnoffice s = new Ssnoffice();

        // System.out.println(b.getInfo());
        System.out.println(s.privateInfo());
    }

}
