public class Data<G> {
    private Object[] ruang = new Object[100];
    private int banyak = 0;

    public G getIsi(int posisi) {
        if (posisi >= 1 && posisi <= 100) {
            return (G) ruang[posisi - 1];
        } else {
            return null;
        }
    }

    public void setIsi(int posisi, G objekBaru) {
        if (posisi >= 1 && posisi <= 100) {
            if (ruang[posisi - 1] == null && objekBaru != null) {
                banyak++;
            } else if (ruang[posisi - 1] != null && objekBaru == null) {
                banyak--;
            }
            ruang[posisi - 1] = objekBaru;
        } else {
            System.out.println("Posisi tidak valid!");
        }
    }
    public int getSize() {
        return this.banyak;
    }
}
