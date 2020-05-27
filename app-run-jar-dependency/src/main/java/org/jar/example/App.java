package org.jar.example;


import lombok.extern.slf4j.Slf4j;

/**
 * <pre>
 *     <code>mvn clean package</code>
 *     <code>jar -jar app-jar-dependency.jar</code>
 * </pre>
 * <p>
 * 如果要发布到其它地方的话需要将lib这人目录也一并copy走。
 */
@Slf4j
public class App {
    public static void main(String[] args) {
        log.info("Hello World!");
    }
}
