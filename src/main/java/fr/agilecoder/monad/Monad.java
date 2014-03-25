package fr.agilecoder.monad;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * User: ptrouillard@gmail.com
 * Date: 24/03/14 09:34
 */
public class Monad {

    private ExecutorService executor = Executors.newFixedThreadPool(5);

    public Monad() {

        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                String threadName = Thread.currentThread().toString();
                System.out.println("Execute the task in thread#" + threadName);
            }
        });

        completableFuture.thenRun(new Runnable() {
            @Override
            public void run() {
                String threadName = Thread.currentThread().toString();
                System.out.println("Finalize the action in thread#" + threadName);
            }
        });

        completableFuture.thenRunAsync(new Runnable() {
            @Override
            public void run() {
                String threadName = Thread.currentThread().toString();
                System.out.println("Finalize the action asynchronously in thread#" + threadName);
            }
        });

        System.out.println("NumberOfDependents : " + completableFuture.getNumberOfDependents());

        completableFuture.complete(null);

        // cancel is ignored because complete is done.
        completableFuture.cancel(true);

    }

    public static void main(String[] args) {
        new Monad();
    }
}
