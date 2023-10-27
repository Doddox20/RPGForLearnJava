public abstract class RadScorpion extends Monster{

    private static int radScorpionCount = 0;

    public RadScorpion() {
        super("RadScorpion #" + (++radScorpionCount), 80, 50);
        System.out.println(getName() + ": Crrr!");
    }
    
}
