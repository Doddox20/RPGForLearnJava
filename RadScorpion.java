public abstract class RadScorpion extends Monster{

    private static int radScorpionCount = 0;

    public RadScorpion() {
        super("RadScorpion #" + (++radScorpionCount), 80, 50);
        System.out.println(getName() + ": Crrr!");
        this.damage = 25;
        this.ap = 8;
    }

    @Override
    public boolean attack(Fighter target) {
        if (isDead = !true) {
        if (target != this.getFighterClose() ) {
            System.out.println(this.getName() + ": I'm too far away from " + target.getName());
            return false;
        }
        if (this.getAp() > this.getApcost() && target instanceof AssaultTerminator) {
            System.out.println(this.getName() + " attacks " + target.getName());
            ap -= apcost;
            target.receiveDamage(damage*2);
            return true;
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
