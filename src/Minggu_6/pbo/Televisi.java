package Minggu_6.pbo;

public class Televisi {

    public String merek;
    public int jumlahChannel;
    private int channelAktif;

    public Televisi() {
        channelAktif = 1;
    }

    public void pindahChannel(int channelBaru) {
        if (channelBaru >= 1 && channelBaru <= jumlahChannel) {
            this.channelAktif = channelBaru;
        } else {
            System.out.println("Channel tidak tersedia!");
        }
    }

    public int getChannelAktif() {
        return channelAktif;
    }
}
