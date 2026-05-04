public class OperatorGenerik {

    public static <G> void Tukar(Datum <G> a, Datum<G> b) {
        G temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public static <G extends Kucing> double bobot2(G x, G y) {
        return x.getBobot() + y.getBobot();
    }

    
}