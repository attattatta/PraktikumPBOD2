//Nama File : Coersion.java
//Pembuat : Naufal Rayan Attallah
//NIM : 24060124140170
//tanggal : 21 April 2026

public class Coersion {
    public static void main(String[] args) {
        int nInteger = 65;
        char nKarakter = (char) nInteger;
        double nReal = nInteger;
        String nString = Integer.toString(nInteger);

        System.out.println("a. Konversi nilai 65");
        System.out.println("Integer : " + nInteger);
        System.out.println("Karakter : " + nKarakter);
        System.out.println("Real : " + nReal);
        System.out.println("String : " + nString);

        int bilanganAwal = 65;
        double bilanganReal = bilanganAwal;
        int bilanganKembali = (int) bilanganReal;

        System.out.println("\nb. integer -> real -> integer");
        System.out.println("Bilangan Awal : " + bilanganAwal);
        System.out.println("Bilangan Real : " + bilanganReal);
        System.out.println("Bilangan Kembali : " + bilanganKembali);

        String x = "1234";
        String y = "5678";
        String S = x + y;
        Integer z = Integer.parseInt(x) + Integer.parseInt(y);

        System.out.println("\nc. Operasi String Integer");
        System.out.println("X : " + x);
        System.out.println("Y : " + y);
        System.out.println("S = X + Y : " + S);
        System.out.println("Z = X + Y : " + z);

        String p = "12.34";
        String q = "56.78";
        String r = p + q;
        Double d = Double.parseDouble(p) + Double.parseDouble(q);

        System.out.println("\nd. Operasi String Real");
        System.out.println("P : " + p);
        System.out.println("Q : " + q);
        System.out.println("R = P + Q : " + r);
        System.out.println("D = P + Q : " + d);

        Integer a = Integer.parseInt(S);
        System.out.println("\ne. Konversi String S ke Integer : " + a);

        String t = Integer.toString(a);
        System.out.println("f. Konversi Integer a ke String : " + t);
    }
}
