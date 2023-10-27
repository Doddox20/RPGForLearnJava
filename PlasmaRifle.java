public class PlasmaRifle extends Weapon {

    protected PlasmaRifle() {

        super("Plasma Rifle", 5, 21, false);
    }

    @Override
    public void attack() {
        System.out.println("PIOU");
    }
    
}
