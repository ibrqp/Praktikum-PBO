package Minggu_6;

public class Roket {

    private String Tipe;
    private int Power;

    public Roket(String tipe, int pwr) {
        this.Tipe = tipe;
        this.Power = pwr;
    }

    public String getTipe() {
        return Tipe;
    }

    public void setTipe(String tipe) {
        Tipe = tipe;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {
        Power = power;
    }
}
