public class SuperMutant extends Monster {
    private static int superMutantCount = 0;

    public SuperMutant() {
        super("SuperMutant #" + (++superMutantCount), 170, 20);
        System.out.println(getName() + ": Roaarrr!");
        this.damage = 60;
        this.ap = 20;
    }

    @Override
    public void recoverAP() {
        if (isDead == !true) {
            if (ap < 50) {
                ap += 7;
                hp += 10;
                if (ap > 50) {
                    ap = 50;

                }
                if (hp > 170){
                    hp = 170;
                }
            }
        }
    }

}