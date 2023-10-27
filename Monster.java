public abstract class Monster extends Unit{

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

    
}
