package calebcurry.methods;

public class User {

    public String firstname;
    public String lastname;

//    public void output(int times) {
//        for (int i = 0; i < times; i++) {
//            System.out.println(firstname + " " + lastname);
//        }

    public String output(){
        return "hi my name is " +
                firstname + lastname + ".";
    }
    public String getFulname(){
        return getFirstname() + " " + lastname;
    }
    public String getFirstname(){
        return  firstname.toUpperCase();
    }
    public void setFirstname(String fn){
        firstname=fn.strip().toLowerCase();
    }
    public void setLastname(String ln){
        lastname=ln;
    }
//    public void printUser(){
//        System.out.println(getFulname());
//    }
    public static  void printUser(User u){
        System.out.println(u.getFulname());
    }

}