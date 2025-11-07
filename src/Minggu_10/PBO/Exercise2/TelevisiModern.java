package Minggu_10.PBO.Exercise2;

public class TelevisiModern extends Elektronik {
    private String modelInput;

    public TelevisiModern() {
        this.modelInput = "HDMI";
        this.voltase = 220;

    }
    public String getModelInput(){
        return modelInput;
    }
}
