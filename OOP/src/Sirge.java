public class Sirge {
    private Punkt punktA;
    private Punkt punktB;
    private double pikkus;

    public Sirge() {
        this.punktA = this.punktB = new Punkt();
    }

    public Sirge(Punkt punktA, Punkt punktB) {
        this.punktA = punktA;
        this.punktB = punktB;
    }

    public double getPikkus() {
        pikkus = Math.sqrt(Math.pow((punktB.getX() - punktA.getX()), 2) + Math.pow((punktB.getY() - punktA.getY()), 2));
        pikkus = Math.round(pikkus * 100) / 100.0;
        return pikkus;
    }

    @Override
    public String toString() {
        return punktA +
                " ja " + punktB +
                ", pikkus =  " + this.getPikkus();
    }
}