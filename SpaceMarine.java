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

    private boolean isWeaponEquippedByOthers(Weapon weapon) {
        for (SpaceMarine spaceMarine : allSpaceMarines) {
            if (spaceMarine.getWeapon() == weapon) {
                return true;
            }
        }
        return false;
    }
}
