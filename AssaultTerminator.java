public abstract class AssaultTerminator extends SpaceMarine {


    protected AssaultTerminator(String name) {
        super(name, 150, 30);
        equip(new PowerFist());
        System.out.println(getName() + " has teleported from space.");
    }

    public int reduceDamage(int damage) {
        if (damage - 3 > 1){
        return damage - 3;
        }
        else{
            return 1;
        }
    }
    

    


}
