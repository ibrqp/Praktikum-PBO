package Minggu_12.Tugas;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        double percentage = 0.0;
        if (level == 1) {
            percentage = 0.30;
        } else if (level == 2) {
            percentage = 0.40;
        } else if (level == 3) {
            percentage = 0.50;
        }
        
        long healAmount = Math.round(this.health * percentage);
        this.health += healAmount;
    }

    @Override
    public void destroy() {
        double percentage = 0.01;
        long damageAmount = Math.round(this.health * percentage);
        this.health -= damageAmount;
    }
}