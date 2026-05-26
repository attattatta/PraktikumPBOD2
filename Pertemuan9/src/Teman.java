//Naufal Rayan Attallah
//24060124140170
//Teman.java

import java.util.ArrayList;

public class Teman {
    private int nbelm;
    private ArrayList<String> Lnama;
    //private int maxNbelm = -1;
    
    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public String getNama(int index) {
        if (index >= 0 && index < nbelm) {
            return Lnama.get(index);
        } else {
            return null;
        }
    }

    public void setNama(int index, String nama) {
        Lnama.set(index, nama);
    }

    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
        }
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String oldNama, String newNama) {
        int index = Lnama.indexOf(oldNama);
        if (index != -1 && newNama != null && !newNama.isEmpty()) {
            Lnama.set(index, newNama);
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    public void showTeman() {
        for (String nama : Lnama) {
            System.out.println("- " + nama);
        }
    }
}
