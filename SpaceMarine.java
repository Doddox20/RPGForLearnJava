public abstract class SpaceMarine extends Unit{

    protected Weapon weapon;
    public Weapon getWeapon() {
        return weapon;
    }
     protected SpaceMarine(String name, int hp, int ap) {
        super(name, hp, ap);
    }
    @Override
    public boolean equip(Weapon weapon) {
        if (isDead == !true) {
        if (this.weapon == null && weapon.isEquipped() == false ) {
            this.weapon = weapon;
            System.out.println(this.getName() + " has been equipped with a " + weapon.getName() + ".");
            weapon.equipped = true;
            return true;
        } else {
            return false;
        }
        
    }
    return false;
    }
    @Override
    public boolean attack(Fighter target){
        if (isDead == !true) {
        if (weapon == null) {
            System.out.println(getName() + ": Hey, this is crazy. I'm not going to fight empty-handed.");
            return false;
        } else if (weapon.isMelee() && target != this.getFighterClose()) {
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
        }}
        return false;
    }
    // public boolean isWeaponEquippedByOthers(Weapon weapon) {
    //     for (SpaceMarine spaceMarine : allSpaceMarines) {
    //         if (spaceMarine.getWeapon() == weapon) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    public boolean moveCloseTo(Fighter target) {
        if (isDead == !true) {
        if (weapon != null && weapon.isMelee() && target != this && this.getFighterClose() != target) {
            System.out.println(getName() + " is moving closer to " + target.getName());
            fighterClose = target;
            return true;
        } else {
            return false;
        }
    }
    return false;
    }

    @Override
    public void recoverAP() {
        if (isDead == !true) {
        if (ap < 50) {
            ap += 9;
            if (ap > 50) {
                ap = 50;
            }
        }
    }
    }


}
