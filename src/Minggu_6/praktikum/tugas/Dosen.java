package Minggu_6.praktikum.tugas;

class Dosen extends Pegawai {
    private int jumlahSKS;
    public static final int TARIF_SKS = 100000;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int sks) {
        this.jumlahSKS = sks;
    }

    public int getGaji() {
        return jumlahSKS * TARIF_SKS;
    }
}
