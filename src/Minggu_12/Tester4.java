package Minggu_12;

public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        ow.pay(eBill);
        System.out.println("-----------------------------------------");
        
        PermanentEmployee eEmp = new PermanentEmployee("Dedik", 500);
        ow.pay(eEmp);
        System.out.println("-----------------------------------------");
        
        IntershipEmployee iEmp = new IntershipEmployee("Sunarto ", 5);
        ow.showMyEmplyee(eEmp);
        System.out.println("-----------------------------------------");
        ow.showMyEmplyee(iEmp);
    }
}
