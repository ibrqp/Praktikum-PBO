package ibra.relasiclass.percobaan1;

public class Laptop {

    private String merk;
    private Processor proc;

    public Laptop() {
    }

    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public void setMerk(String merek){
        merk = merek;
    }
    public void setProc(Processor proch){
        proc = proch;
    }
    public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }

}
