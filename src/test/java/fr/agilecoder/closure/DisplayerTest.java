package fr.agilecoder.closure;

import org.junit.Test;

/**
 * User: ptrouillard@gmail.com
 * Date: 24/03/14 14:35
 */
public class DisplayerTest {

        @Test
        public void test() {
            IAffichage aff=()->System.out.println("Hello lambdas expressions!");
            Displayer.display(aff);
        }
}
