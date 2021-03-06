package usermanagement.service;

import org.junit.Test;
import usermanagement.entity.Person;

import static org.aspectj.runtime.internal.Conversions.intValue;


import static org.junit.Assert.assertEquals;

public class TransformServiceTest {

    private final TransformService transformer = new TransformService();
    private static final Integer ID = 97102622;

    @Test
    public void test_TransformService_toUserDomain_function() {
        Person person = new Person();
        person.setPersonId(ID);

        assertEquals(transformer.toUserDomain(person).getUserId(), ID);
    }

    @Test
    public void test_TransformService_toUserEntity_function() {
        User user = new User();
        user.setUserId(ID);

        assertEquals(transformer.toUserEntity(user).getPersonId(), intValue(ID));
    }
}
