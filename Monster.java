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
    public void equip(){
        System.out.println("Monsters are proud and fight with their own bodies.");
    }

    public boolean attack(Fighter target){
        if (!moveCloseTo(target)) {
            System.out.println(this.getName() + ": I'm too far away from " + target.getName());
            return false;
        }
        if (this.getAp() > this.getApcost()){
            System.out.println(this.getName() + " attacks " + target.getName());
            ap -= apcost;
            return true;
        } else {

        }

    }

}
