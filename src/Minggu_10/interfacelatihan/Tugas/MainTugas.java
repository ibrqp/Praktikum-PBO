package Minggu_11.interfacelatihan.Tugas;

public class MainTugas {
    public static void main(String[] args) {
        Singa singa = new Singa("Singa", "Roar", "Kuning Emas", 4);
        Keledai keledai = new Keledai("Keledai", "Ihaaa", "Abu-abu", 4);
        Gorila gorila = new Gorila("Gorila", "Hu Hu", "Hitam", 2);

        singa.tampilkanInfo();
        singa.makanDaging();
        System.out.println();

        keledai.tampilkanInfo();
        keledai.makanTumbuhan();
        System.out.println();

        gorila.tampilkanInfo();
        gorila.makanTumbuhan();
        gorila.makanDaging();
    }
}
