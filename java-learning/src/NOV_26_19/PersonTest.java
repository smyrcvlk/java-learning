package NOV_26_19;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person p= new Person();
        p.setName("Techno");
        String actual=p.getName();
        String expected="Techno";
        Assert.assertEquals(actual,expected);

    }
    @Test
    void setName() {
    }
    @org.junit.Test
     void MethodTest(){
       Person p= new Person();
       p.Method();
       String actual=p.Method();
       String expected="somevalue";
       Assert.assertEquals(actual,expected);
     }
}