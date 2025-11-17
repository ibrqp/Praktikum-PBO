package Minggu_12.Tugas;

public abstract class Zombie implements IDestroyable {
    protected int health;
    protected int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public abstract void heal();
    public abstract void destroy();

    public String getZombieInfo() {
        String info = getClass().getSimpleName().replace("Zombie", " Zombie Data =");
        info = info.replace("Walking", "Walking");
        
        return info + "\nHealth = " + health + "\nLevel = " + level;
    }

    @Override
    public boolean isDestroyed() {
        return health <= 0;
    }
}