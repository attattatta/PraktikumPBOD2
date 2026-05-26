import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswa = new HashMap<>();

        mahasiswa.put("24060124140160", "Naufal");
        mahasiswa.put("24060124140161", "Rayan");
        mahasiswa.put("24060124140162", "Attallah");
        mahasiswa.put("24060124140163", "Putra");
        mahasiswa.put("24060124140164", "Fauzan");

        // lambda untuk menampilkan key dan value
        mahasiswa.forEach((nim, nama) -> {
            System.out.println("NIM  : " + nim);
            System.out.println("Nama : " + nama);
            System.out.println();
        });
    }
}