package Minggu_5.Tugas;

public class MotorMain {
    public static void main(String[] args) {
        Mesin ms = new Mesin("v8", 1000000);
        Bensin bs = new Bensin("Premium", "Kuning");
        BanMotor bm = new BanMotor("Swallow", "Hitam Legam");
        VelgMotor vm = new VelgMotor("ITK Velg", "Silver");

        SepedaMotor spd1 = new SepedaMotor("Hondia", "Carbon", bs, ms, bm, vm);
        spd1.tampilkanInfo();
    }
}
