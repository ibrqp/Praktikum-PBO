package Minggu_12.Tugas;

public class Barrier implements IDestroyable {
    private int health;

    public Barrier(int health) {
        this.health = health;
    }

    public void destroy() {
        this.health -= 9;
    }
    
    public String getBarrierInfo() {
        return "Barrier Strength = " + health;
    }

    @Override
    public boolean isDestroyed() {
        return health <= 0;
    }
}