package org.datastructure.executorservice;

import org.datastructure.threading.MultiThreadingWithThreadClass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceSingleThread {

    public static void main(String[] args) {
        ExecutorService executorService = java.util.concurrent.Executors.newSingleThreadExecutor();

        executorService.execute(() -> {
            System.out.println("Task 1 is running");
            new MultiThreadingWithThreadClass().start();
        });

        // Step 3: Shutdown the ExecutorService
        executorService.shutdown();

        // Step 4: Wait for all tasks to complete
        try {
            if (!executorService.awaitTermination(1, TimeUnit.SECONDS)) {
                System.out.println("Forcing shutdown as tasks did not finish in time.");
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            e.printStackTrace();
        }

        System.out.println("All tasks are finished.");
    }
}
