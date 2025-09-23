package ibra.relasiclass.percobaan1;

public class Processor {

    private String merk;
    private double cache;

    public Processor() {
    }

    
    public Processor(String Merk, double cache) {
        this.merk = Merk;
        this.cache = cache;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merek) {
        merk = merek;
    }

    public void setCache(double cacha) {
        cache = cacha;
    }

    public double getCache() {
        return cache;
    }

    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}
