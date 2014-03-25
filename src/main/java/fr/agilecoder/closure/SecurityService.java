package fr.agilecoder.closure;

/**
 * User: ptrouillard@gmail.com
 * Date: 24/03/14 14:43
 */
public interface SecurityService {

    /**
     * authenticate user using agnostic authentication method.
     * @param authentication
     * @param login
     * @param password
     * @throws SecurityException
     */
    public static void authenticate(IAuth authentication, String login, String password) throws SecurityException {
        authentication.authenticate(login, password);
    }
}
