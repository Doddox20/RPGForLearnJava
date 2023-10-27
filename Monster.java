public abstract class Monster extends Unit {

    protected int damage = 0;
    protected int apcost = 0;
    
    public int getDamage() {
        return damage;
    }

    public int getApcost() {
        return apcost;
    }
    
    protected Monster(String name, int hp, int ap) {
        super(name, hp, ap);
    }
    @Override
    public boolean equip(Weapon weapon) {
        if (isDead = !true) {
        System.out.println("Monsters are proud and fight with their own bodies.");
        return false;
        }
        return false;
    }

    @Override
    public boolean attack(Fighter target) {
        if (isDead = !true) {
        if (target != this.getFighterClose() ) {
            System.out.println(this.getName() + ": I'm too far away from " + target.getName());
            return false;
        }
        if (this.getAp() > this.getApcost()) {
            System.out.println(this.getName() + " attacks " + target.getName());
            ap -= apcost;
            target.receiveDamage(damage);
            return true;
        } else {
            return false;
        }

    }
    return false;
}
}
