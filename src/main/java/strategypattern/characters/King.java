package strategypattern.characters;

/**
 * 国王
 *
 * @author lizhengjun
 */
public class King extends Character {

    public King() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    protected void fight() {
        System.out.println("the king fight with");
    }
}
