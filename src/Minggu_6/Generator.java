package Minggu_6;

public class Generator {

    private int Daya;
    private int Voltase;

    public Generator(int dy, int volt) {
        this.Daya = dy;
        this.Voltase = volt;
    }

    public int getVoltase() {
        return Voltase;
    }

    public void setGenerator(int volt) {
        Voltase = volt;
    }
    public int getDaya() {
        return Daya;
    }

    public void setDaya(int daya) {
        Daya = daya;
    }
}
