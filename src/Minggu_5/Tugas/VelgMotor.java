package Minggu_5.Tugas;

public class VelgMotor {

    private String namaVelg;
    private String warnaVelg;

    public VelgMotor(String namaVelg, String warnaVelg) {
        this.namaVelg = namaVelg;
        this.warnaVelg = warnaVelg;
    }

    public String getnamaVelg() {
        return namaVelg;
    }

    public void setnamaVelg(String nama) {
        namaVelg = nama;
    }

    public String getwarnaVelg() {
        return warnaVelg;
    }

    public void setwarnaVelg(String warna) {
        warnaVelg = warna;
    }

    public void tampilkanInfo() {
        System.out.println("Name : " + getnamaVelg());
        System.out.println("Warna : " + getwarnaVelg());
    }
}
