public class MBangunDatar {
    public void cekLuas(BangunDatar X, BangunDatar Y){
        if(X.isEqualLuas(Y)){
            System.out.println("Luas kedua bangun datar sama");
        } else {
            System.out.println("Luas kedua bangun datar berbeda");
        }
    }

    public static void main(String[] args) {
        BangunDatar B1 = new BangunDatar();
        BangunDatar P1 = new Persegi(10);
        BangunDatar L1 = new Lingkaran(7);
        BangunDatar P2 = new Persegi(5);
        BangunDatar L2 = new Lingkaran(14);

        MBangunDatar app = new MBangunDatar();
        app.cekLuas(B1, P1);
        app.cekLuas(P1, P2);
    }
}
