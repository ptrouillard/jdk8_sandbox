package fr.agilecoder.monad;

import java.util.concurrent.CompletableFuture;

/**
 * User: ptrouillard@gmail.com
 * Date: 24/03/14 15:53
 */
public class MonadAll {
    public static void main(String[] args) {
        new MonadAll();
    }

    public MonadAll() {
        Runnable action = () -> {
            String threadName = Thread.currentThread().toString();
            System.out.println("Execute the task in thread#" + threadName);};

        Runnable afterAll = () -> { System.out.println("After all");};
        CompletableFuture.allOf(CompletableFuture.runAsync(action), CompletableFuture.runAsync(action), CompletableFuture.runAsync(action)).thenRunAsync(afterAll);

    }
}
