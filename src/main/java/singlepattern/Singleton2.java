package singlepattern;

/**
 * 粗暴解决懒汉模式线程不安全问题
 *
 * 缺点：性能低
 *
 * @author lizhengjun
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2(){}

    public synchronized static Singleton2 getInstance() {
        if (instance == null) {
            return new Singleton2();
        } else {
            return instance;
        }
    }

}
