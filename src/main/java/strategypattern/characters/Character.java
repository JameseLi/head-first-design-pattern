package strategypattern.characters;

/**
 * 角色类
 *
 * @author lizhengjun
 */
public abstract class Character {

    WeaponBehavior weaponBehavior;

    /**
     * 战斗方法
     */
    protected abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void performWeapon() {
        weaponBehavior.useWeapon();
    }
}
