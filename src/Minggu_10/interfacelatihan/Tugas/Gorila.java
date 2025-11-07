package Minggu_11.interfacelatihan.Tugas;

public class Gorila extends Hewan implements Herbivora, Karnivora {
    public Gorila(String nama, String suara, String warnaBulu, int jumlahKaki){
        super(nama, suara, warnaBulu, jumlahKaki);
    }

    @Override
    public void makanTumbuhan() {
        System.out.println("Aku makan tumbuhan seperti herbivora!");
    }

    @Override
    public void makanDaging() {
        System.out.println("Aku juga makan daging seperti karnivora!");
    }
}
