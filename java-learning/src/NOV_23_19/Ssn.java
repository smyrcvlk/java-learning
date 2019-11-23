package NOV_23_19;

public class Ssn {
    public String firstName;
    public String lastName;
    public int ssn_number;
    public Official official;

    public Ssn(){
    }

    public Ssn( String firstName, String lastName, int ssn_number) {
        this.firstName = firstName;
        this.lastName= lastName;

         official = new Official();
         official.firstName = firstName;
         official.lastName = lastName;
    }

}
