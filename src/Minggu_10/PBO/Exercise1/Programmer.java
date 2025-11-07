package Minggu_10.PBO.Exercise1;

public class Programmer extends Pegawai{
    private int bonus;

    public Programmer(String nama, int gaji, int bonus) {
        this.nama = nama;
        this.gaji = gaji;
        this.bonus = bonus;
    }

    @Override
    public int getGaji(){
        return gaji += bonus;
    }
    public int getBonus(){
        return bonus;
    }
    
}
