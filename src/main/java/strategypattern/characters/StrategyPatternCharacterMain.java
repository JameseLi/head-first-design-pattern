package strategypattern.characters;

/**
 * @author lizhengjun
 */
public class StrategyPatternCharacterMain {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();
        king.performWeapon();
        king.setWeaponBehavior(new AxeBehavior());
        king.performWeapon();
    }
}
