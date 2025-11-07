package Minggu_11.interfacelatihan.Tugas;

public class Keledai extends Hewan implements Herbivora {
    public Keledai(String nama, String suara, String warnaBulu, int jumlahKaki){
        super(nama, suara, warnaBulu, jumlahKaki);
    }

    @Override
    public void makanTumbuhan() {
        System.out.println("Aku suka makan tumbuhan. Aku adalah Herbivora!");
    }
}