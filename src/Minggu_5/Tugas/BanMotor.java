package Minggu_5.Tugas;

public class BanMotor {

    private String namaBan;
    private String warnaBan;

    public BanMotor(String namaBan, String warnaBan) {
        this.namaBan = namaBan;
        this.warnaBan = warnaBan;
    }

    public String getNamaBan() {
        return namaBan;
    }

    public void setNamaBan(String nama) {
        namaBan = nama;
    }

    public String getwarnaBan() {
        return warnaBan;
    }

    public void setWarnaBan(String warna) {
        warnaBan = warna;
    }

    public void tampilkanInfo() {
        System.out.println("Name : " + getNamaBan());
        System.out.println("Warna : " + getwarnaBan());
    }
}
