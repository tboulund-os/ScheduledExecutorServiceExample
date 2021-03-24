package dk.easv;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        ClockRunnable task = new ClockRunnable();

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

        // Will execute the task once after the delay has passed.
        executorService.schedule(task, 1, TimeUnit.SECONDS);

        // The delay is counted from when the previous execution started.
        executorService.scheduleAtFixedRate(task, 0, 1, TimeUnit.SECONDS);

        // The delay is counted from when the previous execution stopped.
        executorService.scheduleWithFixedDelay(task, 0, 1, TimeUnit.SECONDS);
    }
}
