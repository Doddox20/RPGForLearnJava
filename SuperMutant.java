public class SuperMutant extends Monster {
    private static int superMutantCount = 0;

    public SuperMutant() {
        super("SuperMutant #" + (++superMutantCount), 170, 20);
        System.out.println(getName() + ": Roaarrr!");
    }

    @Override
    public void recoverAP() {
        if (!isDead) {
            super.recoverAP();


        }
    }
}