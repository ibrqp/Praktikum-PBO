package KoperasiGetterSetter;

import java.util.Scanner;

public class TestKoperasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Masukkan Jumlah Pinjaman : ");
            float jmlPinjaman = sc.nextFloat();

            Anggota donny = new Anggota("111333444", "Donny", jmlPinjaman);

            System.out.println("Nama Anggota: " + donny.getNama());
            System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

            System.out.print("Masukkan Jumlah Angsuran : ");
            sc.nextFloat();
            System.out.println("\nMeminjam uang 10.000.000...");
            donny.pinjam(10000000);

            System.out.println("\nMeminjam uang 4.000.000...");
            donny.pinjam(4000000);
            System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

            System.out.println("\nMembayar angsuran 1.000.000...");
            donny.angsur(1000000);
            System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

            System.out.println("\nMembayar angsuran 3.000.000...");
            donny.angsur(3000000);
            System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        } while (false);
    }
}
!