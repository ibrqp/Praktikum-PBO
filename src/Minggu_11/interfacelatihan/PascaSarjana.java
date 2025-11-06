package Minggu_11.interfacelatihan;

public class PascaSarjana extends Mahasiswa implements Icumlaude {

    public PascaSarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-Ku lebih dari 3,71");
    }
}
