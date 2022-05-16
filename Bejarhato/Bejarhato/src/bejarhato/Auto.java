package bejarhato;
public class Auto {
    private String tipus, rsz;

    public Auto(String tipus, String rsz) {
        this.tipus = tipus;
        this.rsz = rsz;
    }

    @Override
    public String toString() {
        return "Auto{" + "tipus=" + tipus + ", rsz=" + rsz + '}';
    }
}
