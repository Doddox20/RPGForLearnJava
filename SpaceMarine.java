import java.util.List;
public abstract class SpaceMarine extends Unit{

   

    protected Weapon weapon;
    protected List<SpaceMarine> allSpaceMarines;
    public Weapon getWeapon() {
        return weapon;
    }
     protected SpaceMarine(String name, int hp, int ap) {
        super(name, hp, ap);
        allSpaceMarines.add(this);
    }
    public boolean equip(Weapon weapon) {
        if (this.weapon == null && !isWeaponEquippedByOthers(weapon)) {
            this.weapon = weapon;
            System.out.println(this.getName() + " has been equipped with a " + weapon.getName() + ".");
            return true;
        } else {
            return false;
        }
    }
    public boolean attack(Fighter target){
        if (weapon == null) {
            System.out.println(getName() + ": Hey, this is crazy. I'm not going to fight empty-handed.");
            return false;
        } else if (weapon.isMelee() && !moveCloseTo(target)) {
            System.out.println(getName() + ": I'm too far away from " + target.getName() + ".");
            return false;
        } else if (getAp() >= weapon.getApcost()) {
            System.out.println(getName() + " attacks " + target.getName() + " with a " + weapon.getName() + ".");
            int damage = weapon.getDamage();
            target.receiveDamage(damage);
            ap =- weapon.getApcost();
            return true;
        } else {
            return false;
        }
    }
    public boolean isWeaponEquippedByOthers(Weapon weapon) {
        for (SpaceMarine spaceMarine : allSpaceMarines) {
            if (spaceMarine.getWeapon() == weapon) {
                return true;
            }
        }
        return false;
    }
    public boolean moveCloseTo(Fighter target) {
        if (weapon != null && weapon.isMelee() && target != this) {
            System.out.println(getName() + " is moving closer to " + target.getName());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void recoverAP() {
        if (ap < 50) {
            ap += 9;
            if (ap > 50) {
                ap = 50;
            }
        }
    }


}
