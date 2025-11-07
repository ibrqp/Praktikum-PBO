package Minggu_11.interfacelatihan;

public class Rektor {

    public void berSertifikatCumlaude(Mahasiswa mahasiswa) {
        if (mahasiswa instanceof Icumlaude) {
            System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
            System.out.println("Selamat! silahkan perkenalkan diri Anda ...");

            mahasiswa.kuliahDiKampus();
            ((Icumlaude) mahasiswa).lulus();
            ((Icumlaude) mahasiswa).meraihIPKTinggi();
        } else {
            System.out.println("Maaf, " + mahasiswa.nama + " belum memenuhi syarat cumlaude.");
        }
        System.out.println("----------------------------------------------");
    }

    public void beriSertifikatMawapres(IBerprestasi mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");
        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();
        System.out.println("----------------------------------------------");
    }
}
