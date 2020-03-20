package strategypattern.ducks;

/**
 * @author lizhengjun
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("can`t quack");
    }
}
