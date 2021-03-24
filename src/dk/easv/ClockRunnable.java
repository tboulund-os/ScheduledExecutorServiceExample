package dk.easv;

import java.time.LocalDateTime;

public class ClockRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(LocalDateTime.now());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
