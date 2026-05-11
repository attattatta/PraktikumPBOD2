//Nama : Naufal Rayan Attallah
//NIM : 24060124140170
//Tanggal : 28 April 2026

//renungan : Generik memungkinkan kita untuk membuat kelas atau metode 
// yang dapat bekerja dengan berbagai tipe data tanpa harus menulis kode 
// yang sama berulang kali untuk setiap tipe data.

public class mainData {
    public static void main(String[] args){
        Data<Anabul2> dataAnabul = new Data<>();
        dataAnabul.setIsi(1, new Anabul2("Kucing"));
        dataAnabul.setIsi(2, new Anabul2("Anjing"));
        dataAnabul.setIsi(3, new Anabul2("Burung"));

        System.out.println("\n--- Mengecek Ukuran ---");
        System.out.println("Jumlah elemen dalam array: " + dataAnabul.getSize());

        System.out.println("\n--- Mengambil Data ---");
        Anabul2 a1 = dataAnabul.getIsi(1);
        if (a1 != null) {
            System.out.println("Elemen ke-1: " + a1.nama);
        } else {
            System.out.println("Elemen ke-1: null");
        }
    }
}
