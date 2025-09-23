package ibra.relasiclass.Percobaan4;
public class Kursi {

    private String nomor;
    private Penumpang penumpang;

    public Kursi(String nomor) {
        this.nomor = nomor;
    }
    public void setNomor(String nomor) {
        nomor = this.nomor;
    }
    public String getNomor() {
        return nomor;
    }
    public void setPenumpang(Penumpang penumpang) {
        penumpang = this.penumpang;
    }
    
    public Penumpang getPenumpang() {
        return penumpang;
    }
    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }
}
