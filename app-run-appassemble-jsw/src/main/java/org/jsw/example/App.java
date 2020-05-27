package org.jsw.example;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * <pre>
 *     <code>mvn clean package</code>
 *     <code>./bin/bootstrap start|stop|...</code>
 * </pre>
 *
 * @author yaoxm
 */
@Slf4j
public class App {
    public static void main(String[] args) throws InterruptedException {
        Thread libertyThread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                log.info("i am spinning.");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    log.warn("", e);
                }
            }

            log.info("i stopped.");
        });
        libertyThread.start();

        log.info("main thread waiting libertyThread.");

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            libertyThread.interrupt();
            log.info("interrupted libertyThread before JVM exit.");
        }));

        libertyThread.join();
    }
}
