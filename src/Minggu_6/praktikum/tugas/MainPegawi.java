package Minggu_6.praktikum.tugas;

public class MainPegawi {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("198001", "Budi Santoso", "Malang");
        d1.setSKS(12);

        Dosen d2 = new Dosen("198002", "Ani Lestari", "Surabaya");
        d2.setSKS(15);

        DaftarGaji daftar = new DaftarGaji(5);
        daftar.addPegawai(d1);
        daftar.addPegawai(d2);

        daftar.printSemuaGaji();
    }
}
