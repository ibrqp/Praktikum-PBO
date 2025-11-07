package Minggu_10.PBO.Exercise2;


public class Manusia {

    public void nyalakanPerangkat(Elektronik perangkat) {
        // int voltase = perangkat.getVoltase();
            System.out.println("nyalakan televisi");
        if (perangkat instanceof TelevisiJadul) {
            System.out.println("jadul dengan input :" + ((TelevisiJadul) perangkat).getModelInput());
            System.out.println("Voltase Televisi: "+ perangkat.getVoltase() );
        } else if (perangkat instanceof TelevisiModern) {
            System.out.println("jadul dengan input :" + ((TelevisiModern) perangkat).getModelInput());
            System.out.println("Voltase Televisi: "+ perangkat.getVoltase() );
        }
    }
}
