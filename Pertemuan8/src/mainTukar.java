public class mainTukar {
    public static void main(String[] args) {
        Generik g = new Generik();

        // Contoh penggunaan metode generik Tukar
        Integer a = 5;
        Integer b = 10;
        System.out.println("Sebelum tukar: a = " + a + ", b = " + b);
        g.Tukar(a, b);
        System.out.println("Setelah tukar: a = " + a + ", b = " + b);

        // Contoh penggunaan metode generik bobot2
        Kucing2 kucing1 = new Kucing2("Kucing A", 4);
        Kucing2 kucing2 = new Kucing2("Kucing B", 6);
        int totalBobot = g.bobot2(kucing1, kucing2);
        System.out.println("Total bobot kedua kucing: " + totalBobot);
    }
}
