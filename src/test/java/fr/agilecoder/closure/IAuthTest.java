package fr.agilecoder.closure;

import org.junit.Test;

/**
 * User: ptrouillard@gmail.com
 * Date: 24/03/14 14:40
 */
public class IAuthTest {

    @Test
    public void verify_valid_authentication_method() {
        IAuth dummyAuthMethod = (String login, String password) -> {if (login.equals(password)) return; throw new SecurityException("Authentication refused for login " + login);};
        SecurityService.authenticate(dummyAuthMethod, "pierrot", "pierrot");
    }

    @Test(expected = SecurityException.class)
    public void verify_invalid_authentication_method() {
        IAuth dummyAuthMethod = (String login, String password) -> {if (login.equals(password)) return; throw new SecurityException("Authentication refused for login " + login);};
        SecurityService.authenticate(dummyAuthMethod, "pierrot", "motdepasse");
    }

}
