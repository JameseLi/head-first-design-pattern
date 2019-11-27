package observerpattern.weatherdata;

/**
 * 观察者
 *
 * @author lizhengjun
 */
public interface Observer {
    /**
     * 修改温度、湿度、气压
     *
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(float temp,float humidity,float pressure);
}
