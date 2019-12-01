package singlepattern;

/**
 * 改进版线程安全懒汉模式
 *
 * @author lizhengjun
 */
public class Singleton3 {
    private static volatile Singleton3 instance;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    return new Singleton3();
                }
            }
        }
        return instance;
    }
}
