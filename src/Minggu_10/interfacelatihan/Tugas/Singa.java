package Minggu_11.interfacelatihan.Tugas;

public class Singa extends Hewan implements Karnivora {
    public Singa(String nama, String suara, String warnaBulu, int jumlahKaki){
        super(nama, suara, warnaBulu, jumlahKaki);
    }

    @Override
    public void makanDaging() {
        System.out.println("Aku suka makan daging. Aku adalah Karnivora!");
    }
}