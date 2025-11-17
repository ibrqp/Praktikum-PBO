package Minggu_12;

public class ElectricityBill implements Payable {

    private int kwh;
    private String category;

    public ElectricityBill(int kwh, String category) {
        this.kwh = kwh;
        this.category = category;
    }

    public int getKwh() {
        return kwh;
    }

    public void setKwh(int kwh) {
        this.kwh = kwh;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getBasePrice(){
        int bPprice = 0;
        switch (category) {
            case "R-1" : bPprice = 200; break;
            case "R-2" : bPprice = 400; break;
        }
        return bPprice;
    }
    public String getBillInfo(){
        return "KWH = " +kwh +"\n"+ "Category = "+category + "("+getBasePrice()+" per KWH)\n";
    }
    public int getPaymentAmount() { 
        return kwh * getBasePrice();
    }
}
