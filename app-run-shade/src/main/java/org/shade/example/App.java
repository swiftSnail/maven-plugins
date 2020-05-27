package org.shade.example;

import lombok.extern.slf4j.Slf4j;

/**
 * <pre>
 *     <code>mvn clean package</code>
 *     <code>java -jar app-shade-1.0.jar</code>
 * </pre>
 */
@Slf4j
public class App {
    public static void main(String[] args) {
        log.info("Hello World!");
    }
}
