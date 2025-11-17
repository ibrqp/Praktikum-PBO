package Minggu_12.Tugas;

public class Plant {
    
    public void doDestroy(IDestroyable d) {
        if (d instanceof Zombie) {
            Zombie z = (Zombie) d;
            z.destroy();
            z.heal(); 
        } 
        else if (d instanceof Barrier) {
            Barrier b = (Barrier) d;
            b.destroy();
        }
    }
}