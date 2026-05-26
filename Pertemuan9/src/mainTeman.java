//Naufal Rayan Attallah
//24060124140170
//mainTeman.java

public class mainTeman {
    public static void main(String[] args) {
        Teman t = new Teman();
        t.addNama("Dwi");
        t.addNama("Basil");
        t.addNama("Azka");
        t.addNama("Menza");
        t.addNama("Feri");
        t.addNama("Menza");
        t.addNama("Lutfi");
        t.addNama("Devano");
        t.addNama("Ferdy");
        t.addNama("Caesar");
        t.addNama("Ghatfan");
        t.addNama("Bayu");
        t.addNama("Hasta");
        t.addNama("Izzatu");
        t.addNama("Dinda");
        t.addNama("Elza");
        t.addNama("Novelya");
        t.addNama("Rama");
        t.addNama("Hanif");
        t.addNama("Marchella");
        t.addNama("Atta");

        t.showTeman();
        System.out.println("Jumlah teman: " + t.getNbelm());
        System.out.println("Teman ketiga adalah: " + t.getNama(2));
        t.gantiNama("Dwi", "Yusmawan");
        System.out.println("Setelah perubahan:");
        t.showTeman();
        System.out.println("Apakah Hasta adalah teman? " + t.isMember("Hasta"));
        System.out.println("Jumlah nama 'Menza': " + t.countNama("Menza"));
        t.delNama("Feri");
        System.out.println("Setelah menghapus Feri:");
        t.showTeman();
    }
}
