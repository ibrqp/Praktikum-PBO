public class TestPerbankan {
    public static void main(String[] args) {
        Nasabah nsb1 = new Nasabah();
        Nasabah nsb2 = new Nasabah();


        nsb1.nama = "Bill Gates";
        nsb1.saldo = 1000;
        
        nsb2.nama = "Ridwan Rismanto";
        nsb2.saldo = 9999;
        
        nsb1.tampilkanSaldo("IDR ");
        nsb2.tampilkanSaldo("IDR ");
    }
}
