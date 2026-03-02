public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(2, 3);
        Titik T2 = new Titik(5, 7);
        Garis G1 = new Garis(T1, T2);

        System.out.println("Panjang garis G1: " + G1.panjangGaris());
        System.out.println("Gradien garis G1: " + G1.gradienGaris());

        Titik titikTengahG1 = G1.titikTengah();
        System.out.println("Titik tengah garis G1: (" + titikTengahG1.getAbssis() + ", " + titikTengahG1.getOrdinat() + ")");

        System.out.println("Jumlah Objek Garis: " + Garis.getCounterGaris());
    }
}
