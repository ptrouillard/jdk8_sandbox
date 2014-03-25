package fr.agilecoder.forkJoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * User: ptrouillard@gmail.com
 * Date: 24/03/14 15:43
 */
public class ForkJoinMain {
    public static void main(String[] args) {
        try {
            new ForkJoinMain();
        } catch (ExecutionException e) {
        } catch (InterruptedException e) {
        }
    }

    public ForkJoinMain() throws ExecutionException, InterruptedException {
        Runnable runnable = () -> {
            String thread = Thread.currentThread().toString();
            System.out.println("run thread#" + thread);
        };

        ForkJoinTask<?> forkJoinTask = ForkJoinPool.commonPool().submit(runnable);
        ForkJoinTask<?> forkJoinTask2 = ForkJoinPool.commonPool().submit(runnable);
        forkJoinTask.get();
        forkJoinTask2.get();

    }
}
