package singlepattern;

/**
 * 普通懒汉模式
 *
 * 缺点：多线程情况下，会出现多个实例对象的问题
 *
 * @author lizhengjun
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            return new Singleton();
        } else {
            return instance;
        }
    }
}
