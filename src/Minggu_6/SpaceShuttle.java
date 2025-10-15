package Minggu_6;

public class SpaceShuttle {

    private String Kode;
    private int Berat;
    private Roket RoketUtama;
    private Generator GeneratorUtama;

    public SpaceShuttle(String kd, int brt, Roket rkt, Generator gnt) {
        this.Kode = kd;
        this.Berat = brt;
        this.RoketUtama = rkt;
        this.GeneratorUtama = gnt;
    }

    public String getKode() {
        return Kode;
    }

    public void setKode(String kde) {
        Kode = kde;
    }

    public int getBerat() {
        return Berat;
    }

    public void setBerat(int bert) {
        Berat = bert;
    }
    public Roket getRoketUtama() {
        return RoketUtama;
    }

    public void setRoketUtama(Roket setRktt) {
        RoketUtama = setRktt;
    }
    public Generator getGeneratorUtama() {
        return GeneratorUtama;
    }

    public void setGeneratorUtama(Generator setGnr) {
        GeneratorUtama = setGnr;
    }

}
