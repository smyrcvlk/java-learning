package DEC_07_19.Abstract;

public class Task1 {
    // Create abstract class AbstractLogin
    // add abstract method: testLogin
    // create 3 subclasses as AdminLogin, ManagerLogin, UserLogin
    // and implement method testLogin

    public static void main(String[] args) {
        AbstractLogin admin= new AdminLogin();
        admin.testLogin();
        AbstractLogin  manager= new ManagerLogin();
        manager.testLogin();
        AbstractLogin user=new UserLogin();
        user.testLogin();


    }

}
