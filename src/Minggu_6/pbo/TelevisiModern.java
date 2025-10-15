package Minggu_6.pbo;

public class TelevisiModern extends Televisi {

    private String modusTampilan;
    private String dvd;

    public TelevisiModern(String modusTampilan, int jmlChannel) {
        this.modusTampilan = modusTampilan;
        jumlahChannel = jmlChannel;
        this.dvd = null;
    }

    public void gantiModusTampilan(String moduString) {
        this.modusTampilan = moduString;
    }

    public void mainkanDVD() {
        if (dvd == null) {
            System.out.println("Sedang memainkan DVD: Kosong");
        } else {
            System.out.println("Sedang memainkan DVD: " + dvd);

        }
    }

    public void masukkanDVD(String judulDVD) {
        this.dvd = judulDVD;
    }
}
