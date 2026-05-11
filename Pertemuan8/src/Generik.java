public class Generik {
    public <G> void Tukar(G a, G b) {
        G temp = a;
        a = b;
        b = temp;
    }

    public <G extends Kucing2> int bobot2(G kucingA, G kucingB) {
        return kucingA.bobot + kucingB.bobot;
    }
}
