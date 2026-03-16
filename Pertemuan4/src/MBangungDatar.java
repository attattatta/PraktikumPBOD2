public class MBangungDatar {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi(5, "Merah", "Solid");
        Lingkaran lingkaran1 = new Lingkaran(3, "Biru", "Dashed");

        System.out.println("Informasi Persegi:");
        persegi1.printInfo();
        System.out.println("Keliling Persegi: " + persegi1.getKeliling());
        System.out.println("Luas Persegi: " + persegi1.getLuas());
        System.out.println("Diagonal Persegi: " + persegi1.getDiagonal());

        System.out.println("\nInformasi Lingkaran:");
        lingkaran1.printInfo();
        System.out.println("Keliling Lingkaran: " + lingkaran1.getKeliling());
        System.out.println("Luas Lingkaran: " + lingkaran1.getLuas());
    }
}
