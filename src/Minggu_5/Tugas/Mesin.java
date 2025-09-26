package Minggu_5.Tugas;

public class Mesin {

    private String merkMesin;
    private int ccMesin;

    public Mesin(String merkMesin, int ccMesin) {
        this.merkMesin = merkMesin;
        this.ccMesin = ccMesin;
    }

    public String getmerkMesin() {
        return merkMesin;
    }

    public void setmerkMesin(String nama) {
        merkMesin = nama;
    }

    public int getccMesin() {
        return ccMesin;
    }

    public void setccMesin(int cc) {
        ccMesin = cc;
    }

    public void tampilkanInfo() {
        System.out.println("Name : " + getmerkMesin());
        System.out.println("CC   : " + getccMesin());
    }
}
