public abstract class TacticalMarine extends SpaceMarine {


    protected TacticalMarine(String name) {
        super(name, 100, 20);
        equip(new PlasmaRifle());
        System.out.println(getName() + " on duty.");
        
    }
    @Override
    public void recoverAP() {
        if (isDead == !true) {
        if (ap < 50) {
            ap += 12;
            if (ap > 50) {
                ap = 50;
            }
        }
    }
    }

    
}
