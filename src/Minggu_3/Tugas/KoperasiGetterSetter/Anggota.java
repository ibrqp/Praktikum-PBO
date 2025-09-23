package KoperasiGetterSetter;

public class Anggota {

    private String nomorKTP;
    private String nama;
    private float limit = 5000000;
    private float jmlPinjaman;

    public Anggota(String nomorKTP, String nama, float limit) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limit = limit;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void angsur(float jmlAngsur) {
        if (jmlPinjaman != 0 && jmlAngsur >= 1.0) {
            if (jmlAngsur == jmlPinjaman * .10) {
                jmlPinjaman -= jmlAngsur;
            }else{
                System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
            }
        } else {
            System.out.println("Pastikan Anda Memiliki riwayat peminjaman dan Jumlah Angsuran Anda Lebih dari 1");
        }
    }

    public String getNama() {
        return nama;
    }

    public float getLimitPinjaman() {
        return limit;
    }

    public float getJumlahPinjaman() {
        return jmlPinjaman;
    }

    public void pinjam(float uangPinjam) {
        if (uangPinjam != 0 && uangPinjam < limit) {
            jmlPinjaman += uangPinjam;
        } else {
            System.out.println("Maaf Jumlah Pinjaman melibihi limit.");
        }
    }
}
