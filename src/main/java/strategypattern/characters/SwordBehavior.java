package strategypattern.characters;

/**
 * 剑
 *
 * @author lizhengjun
 */
public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("use sword fight");
    }
}
