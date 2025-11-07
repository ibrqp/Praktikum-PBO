package Minggu_10.PBO.Exercise2;

public class TelevisiJadul extends Elektronik{
    private String modelInput;

    public TelevisiJadul() {
        this.modelInput = "DVI";
        this.voltase = 220;
    }

    public String getModelInput(){
        return modelInput;
    }
}
