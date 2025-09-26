package Minggu_5.Tugas;

public class Bensin {

    private String namaBensin;
    private String warnaBensin;

    public Bensin(String namaBensin, String warnaBensin) {
        this.namaBensin = namaBensin;
        this.warnaBensin = warnaBensin;
    }

    public String getNamaBensin() {
        return namaBensin;
    }

    public void setNamaBensin(String nama) {
        namaBensin = nama;
    }

    public String getWarnaBensin() {
        return warnaBensin;
    }

    public void setWarnaBensin(String warna) {
        warnaBensin = warna;
    }

    public void tampilkanInfo() {
        System.out.println("Name : " + getNamaBensin());
        System.out.println("Warna : " + getWarnaBensin());
    }
}
