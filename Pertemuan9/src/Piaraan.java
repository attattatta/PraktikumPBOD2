public class Piaraan {
    private int nbelm;

    private final Anabul3[] Lanabul;
    public Piaraan() {
        this.Lanabul = new Anabul3[100];
        this.nbelm = 0;
    }

    public int getNbelm() {
        return this.nbelm;
    }

    public void enqueueAnabul(Anabul3 anabul) {
        if (nbelm < Lanabul.length) {
            Lanabul[nbelm] = anabul;
            nbelm++;
        }
    }

    public boolean isMember(Anabul3 anabul) {
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul[i] == anabul) return true;
        }
        return false;
    }

    public Anabul3 getAnabul() {
        return (nbelm > 0) ? Lanabul[0] : null;
    }

    public Anabul3 dequeueAnabul() {
        if (nbelm > 0) {
            Anabul3 temp = Lanabul[0];
            for (int i = 0; i < nbelm - 1; i++) {
                Lanabul[i] = Lanabul[i + 1];
            }
            Lanabul[nbelm - 1] = null;
            nbelm--;
            return temp;
        }
        return null;
    }

    public void showAnabul() {
        for (int i = 0; i < nbelm; i++) {
            // Sekarang getNama() sudah terdefinisi di Anabul3
            System.out.println("- " + Lanabul[i].getNama());
        }
    }

    public double bobotKucing() {
        double total = 0;
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul[i] instanceof Kucing3) {
                total += ((Kucing3) Lanabul[i]).getBobot();
            }
        }
        return total;
    }

    public void showJenisAnabul() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println("- " + Lanabul[i].getClass().getSimpleName() + ": " + Lanabul[i].getNama());
        }
    }
}
