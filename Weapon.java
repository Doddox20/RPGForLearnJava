public abstract class Weapon {

    protected String name;
    protected int apcost;
    protected int damage;
    protected boolean melee;
    protected boolean equipped;

    public int getApcost() {
        return apcost;
    }
    public int getDamage() {
        return damage;
    }
    public String getName() {
        return name;
    }
    public boolean isMelee() {
        return melee;
    }
    public boolean isEquipped(){
        return equipped;
    }

    protected Weapon (String name, int apcost, int damage, boolean melee){
        this.name = name;
        this.apcost = apcost;
        this.damage = damage;
        this.melee = melee;
        this.equipped = false;
    }

    public abstract void attack();
}