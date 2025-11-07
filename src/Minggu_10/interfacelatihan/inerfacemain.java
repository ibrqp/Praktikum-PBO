package Minggu_11.interfacelatihan;

public class inerfacemain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        pakrektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakrektor.beriSertifikatMawapres(masterCumlaude);

        pakrektor.berSertifikatCumlaude(mhsBiasa);
        pakrektor.berSertifikatCumlaude(sarjanaCumlaude);
        pakrektor.berSertifikatCumlaude(masterCumlaude);
   
   
   
    }
}
