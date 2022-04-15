package usermanagement.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {

    @Test
    public void test_person_default_constructor() {
        Person testClass = new Person();

        testClass.setmName("mName1");
        assertEquals("mName1", testClass.getmName());

        testClass.setfName("fName1");
        assertEquals("fName1", testClass.getfName());

        testClass.setlName("lName1");
        assertEquals("lName1", testClass.getlName());

        testClass.setCompanyName("cName1");
        assertEquals("cName1", testClass.getCompanyName());

        testClass.setPersonId(1);
        assertEquals(1, testClass.getPersonId());
    }
}
