public abstract class Unit implements Fighter {
    protected String name;
    protected int hp;
    protected int ap;
    protected boolean isDead = false;
    protected Fighter fighterClose;

    protected Unit(String name, int hp, int ap) {
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }
    @Override
    public int getAp() {
        return ap;
    } 

    public Fighter getFighterClose(){
        return fighterClose;
    }
    @Override
    public int getHp() {
        return hp;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void receiveDamage(int damage) {
        if (isDead == !true) {
            if (hp > 0) {
                hp -= damage;
            }
            if (hp <= 0) {
                hp = 0;
                isDead = true;
            }
        }
    }
    @Override
    public void recoverAP() {
        if (isDead == !true) {
            if (ap < 50) {
                ap += 7;
                if (ap > 50) {
                    ap = 50;

                }
            }
        }
    }
    @Override
    public boolean moveCloseTo(Fighter target) {
        if (isDead == !true) {
            if (target != this && target instanceof Fighter && fighterClose != target) {
                System.out.println(this.getName() + " is moving closer to " + target.getName());
                fighterClose = target;
                return true;
            } else {
                return false;
            }
        }
        return isDead;
    }

}
