package Minggu_6.pbo;

public class TestTelevisi {
    public static void main(String[] args) {
        TelevisiModern tv = new TelevisiModern("Samsung", 100);
        System.out.println("Channel Aktif: "+ tv.getChannelAktif());
        tv.pindahChannel(20);
        System.out.println("Channel aktif sekarang: "+tv.getChannelAktif());
        tv.gantiModusTampilan("HDMI");
        tv.mainkanDVD();
        tv.masukkanDVD("The Matrix");
        tv.mainkanDVD();
    }
}
