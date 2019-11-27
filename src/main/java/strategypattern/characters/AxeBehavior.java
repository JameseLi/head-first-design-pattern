package strategypattern.characters;

/**
 * @author lizhengjun
 */
public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("use axe fight");
    }
}
