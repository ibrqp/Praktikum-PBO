package ibra.relasiclass.Percobaan2;
public class Mobil {

    String mobil;
    int biaya;

    public Mobil() {
    }
    public void setNama(String nama) {
        mobil = nama;
    }
    public String getNama() {
        return mobil;
    }
    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    public int getBiaya() {
        return biaya;
    }
    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}
