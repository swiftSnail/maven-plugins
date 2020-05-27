package org.exec.example;

import lombok.extern.slf4j.Slf4j;

/**
 * 有两种运行方法：
 * <pre>
 *     <code>mvn compile -pl app-exec-run exec:java -Dexec.mainClass="org.exec.example.App" -Dexec.args="swiftsnail"</code>
 *     <code>mvn compile -pl app-exec-run exec:exec -Dexec.executable="java" -Dexec.args=" -DsystemProperty1=value1 -Xmx64m -classpath %classpath org.exec.example.App swiftsnail"</code>
 * </pre>
 * <p>exec主要有两个goal，exec:java && exec:exec。</p>
 * <p>exec:exec相比更灵活些，它是启动一个单独的JVM来运行程序，而且可以设置系统参数及JVM参数等。</p>
 * @author yaoxm
 */
@Slf4j
public class App {
    public static void main(String[] args) {
        log.info("Hello World! Run with exec and args[0] is {}", args[0]);
    }
}
