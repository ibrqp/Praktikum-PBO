package Minggu_11.interfacelatihan.Tugas;

public class Hewan {
    protected String nama, suara, warnaBulu;
    protected int jumlahKaki;

    public Hewan(String nama, String suara, String warnaBulu, int jumlahKaki){
        this.nama = nama;
        this.suara = suara;
        this.warnaBulu = warnaBulu;
        this.jumlahKaki = jumlahKaki;
    }

    public void tampilkanInfo(){
        System.out.println("Nama Hewan     : " + nama);
        System.out.println("Suara Hewan    : " + suara);
        System.out.println("Warna Bulu     : " + warnaBulu);
        System.out.println("Jumlah Kaki    : " + jumlahKaki);
    }
}
