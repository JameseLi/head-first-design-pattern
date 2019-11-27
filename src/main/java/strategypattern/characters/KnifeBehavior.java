package strategypattern.characters;

/**
 * @author lizhengjun
 */
public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("use knife fight");
    }
}
