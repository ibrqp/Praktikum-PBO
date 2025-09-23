package ibra.relasiclass.Percobaan4;
public class Gerbong {

    private String kode;
    private Kursi[] arrayKursi;

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    public void setKode(String kode) {
        kode = this.kode;
    }
    public String getKode() {
        return kode;
    }
public void setPenumpang(Penumpang penumpang, int nomor) {
    Kursi k = this.arrayKursi[nomor - 1];
    if (k.getPenumpang() == null) {
        k.setPenumpang(penumpang);
    } else {
        System.out.println("Kursi nomor " + nomor + " sudah terisi oleh " 
            + k.getPenumpang().getNama());
    }
}

    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
    private void initKursi() {

        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
}
