public class Kolmnurk {
    private Punkt punktA;
    private Punkt punktB;
    private Punkt punktC;

    private Sirge sirgeA;
    private Sirge sirgeB;
    private Sirge sirgeC;

    public Kolmnurk() {
        this.punktA = this.punktB = this.punktC = new Punkt();
        this.sirgeA = this.sirgeB = this.sirgeC = new Sirge();
    }

    public Kolmnurk(Punkt punktA, Punkt punktB, Punkt punktC) {
        this.punktA = punktA;
        this.punktB = punktB;
        this.punktC = punktC;
        this.sirgeA = new Sirge(punktA, punktB);
        this.sirgeB = new Sirge(punktB, punktC);
        this.sirgeC = new Sirge(punktC, punktA);
    }

    public Kolmnurk(Sirge sirgeA, Sirge sirgeB, Sirge sirgeC) {
        this.sirgeA = sirgeA;
        this.sirgeB = sirgeB;
        this.sirgeC = sirgeC;
    }

    public String mediaalKolmnurk() {
        if (sirgeA.getPikkus() == sirgeB.getPikkus() && sirgeB.getPikkus() == sirgeC.getPikkus() && sirgeC.getPikkus() == sirgeA.getPikkus()) {
            return "\nSaab moodustada mediaalkolmnurga";
        } else {
            return "\nEi saa moodustada mediaalkolmnurga";
        }
    }

    @Override
    public String toString() {
        return "Kolmnurk: " +
                "\n AB = " + sirgeA +
                "\n BC = " + sirgeB +
                "\n AC = " + sirgeC +
                this.mediaalKolmnurk();
    }
}