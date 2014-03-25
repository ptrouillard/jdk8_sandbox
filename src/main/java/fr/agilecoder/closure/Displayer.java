package fr.agilecoder.closure;

/**
 * User: ptrouillard@gmail.com
 * Date: 24/03/14 14:31
 */
public interface Displayer {

    public static void display( IAffichage aff){
        aff.affiche();
    }

}
