public abstract class Unit {
    protected String name;
    protected int hp;
    protected int ap;

    protected Unit(String name, int hp, int ap) {
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }

    public int getAp() {
        return ap;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public void receiveDamage(int damage) {
        if (hp > 0) {
            hp -= damage;
        }
        if (hp <= 0) {
            hp = 0;
        }
    }

    public boolean moveCloseTo(Fighter target) {
        if (target != this && target instanceof Fighter) {
            System.out.println(this.getName() + " is moving closer to " + target.getName());
            return true;
        } else {
            return false;
        }
    }
    public void recoverAP() {
        if (ap < 50) {
            ap += 7;
            if (ap > 50) {
                ap = 50;
            }
        }
}
}
