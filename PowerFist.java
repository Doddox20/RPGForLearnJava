public class PowerFist extends Weapon {

    protected PowerFist() {

        super("Power Fist", 8, 50, true);
    }

    @Override
    public void attack() {
        System.out.println("SBAM");
    }
    
}
