package Minggu_5.Tugas;

public class SepedaMotor {

    private String Merek;
    private String Rangka;
    private Mesin mes;
    private Bensin ben;
    private BanMotor ban;
    private VelgMotor velg;

    public SepedaMotor(String Merek, String Rangka, Bensin ben, Mesin mes, BanMotor ban, VelgMotor velg) {
        this.Merek = Merek;
        this.Rangka = Rangka;
        this.mes = mes;
        this.ben = ben;
        this.ban = ban;
        this.velg = velg;
    }

    public String getMerek() {
        return Merek;
    }

    public void setMerek(String nama) {
        Merek = nama;
    }

    public String getRangka() {
        return Rangka;
    }

    public void setRangka(String rangka) {
        Rangka = rangka;
    }

    public Mesin getMesin() {
        return mes;
    }

    public void setMesin(Mesin mess) {
        mes = mess;
    }

    public Bensin getBensin() {
        return ben;
    }

    public void setWarnaBensin(Bensin ben) {
        this.ben = ben;
    }

    public BanMotor getBan() {
        return ban;
    }

    public void setWarnaBan(BanMotor ban) {
        this.ban = ban;
    }

    public VelgMotor betVelg() {
        return velg;
    }

    public void setWarnaBan(VelgMotor velg) {
        this.velg = velg;
    }

    public void tampilkanInfo() {
        System.out.println("Merk Motor : " + getMerek());
        System.out.println("Rangka : " + getRangka());
        System.out.println("Mesin : " + mes.getmerkMesin());
        System.out.println("Ban : " + ban.getNamaBan());
        System.out.println("Velg : " + velg.getnamaVelg());
        System.out.println("Bensin : " + ben.getNamaBensin());
    }

}
