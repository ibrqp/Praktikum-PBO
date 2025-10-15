package Minggu_6.praktikum.Percobaan2;

public class ClassB extends ClassA{

    private int z;

    public void setZ(int Z) {
        this.z = Z;
    }

    public void getNilaiZ() {
        System.out.println("nilai" + z);
    }

    public void getJumlah() {
        System.out.println("jumlah" + (x + y + z));
    }
}
