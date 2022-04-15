package usermanagement.service;

import org.junit.Test;
import usermanagement.entity.Person;

import static org.aspectj.runtime.internal.Conversions.intValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class UserTest {

    private final TransformService transformer = new TransformService();
    private static final Integer ID = 97102622;

    @Test
    public void test_User_equals_function() {
        Person person = new Person();
        person.setPersonId(ID);

        User user = new User();
        user.setUserId(ID);

        assertTrue(transformer.toUserDomain(person).equals(user));
    }
}

