package fr.agilecoder.closure;

/**
 * User: ptrouillard@gmail.com
 * Date: 24/03/14 14:39
 */
public interface IAuth {
    void authenticate(String login, String password) throws SecurityException;
}
