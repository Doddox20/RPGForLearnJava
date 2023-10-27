public abstract class Weapon {

    protected String name;
    protected int apcost;
    protected int damage;
    protected boolean melee;

    public int getApcost() {
        return apcost;
    }
    public int getDamage() {
        return damage;
    }
    public String getName() {
        return name;
    }
    protected Weapon (String name, int apcost, int damage, boolean melee){
        this.name = name;
        this.apcost = apcost;
        this.damage = damage;
        this.melee = melee;
    }

    public abstract void attack();
}