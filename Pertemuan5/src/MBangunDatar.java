public class MBangunDatar {
    public static void main(String[] args) {
        BangunDatar P1 = new Persegi(10, "Merah", "Solid");
        BangunDatar L1 = new Lingkaran(7, "Biru", "Dashed");
        
        Persegi P2 = new Persegi(5, "Kuning", "None");
        Lingkaran L2 = new Lingkaran(14, "Hijau", "Solid");

        System.out.println("\nInfo Persegi P1:");
        P1.printInfo();
        System.out.println("Luas: " + P1.getLuas());

        System.out.println("\nInfo Lingkaran L1:");
        L1.printInfo();
        System.out.println("Keliling: " + L1.getKeliling());

        P2.zoomIn(); 
        System.out.println("Setelah zoomIn: " + P2.getSisi());
        
        P2.zoomOut(); 
        System.out.println("Setelah zoomOut: " + P2.getSisi());
        
        P2.zoom(50); 
        System.out.println("Setelah zoom 50%: " + P2.getSisi());

        System.out.println("Jari-jari awal: " + L2.getJariJari());

        L2.zoom(100);
        System.out.println("Setelah zoom 100%: " + L2.getJariJari());

        BangunDatar.printCounterBangunDatar();
    }
}
