public class Ring {
    double x;
    double y;
    double raadius;
    String varv;

    public Ring() {
        this.x = this.y = this.raadius = 0;
        this.varv = "värvitu";
    }

    public Ring(double raadius) {
        this.x = this.y = 0;
        this.raadius = raadius;
        this.varv = "värvitu";
    }

    public Ring(double x, double y, double raadius, String varv) {
        this.x = x;
        this.y = y;
        this.raadius = raadius;
        this.varv = varv;
    }

    public static void main(String[] args) {
        Ring esimene = new Ring();
        System.out.println(esimene);
        System.out.println("1. ringi ümbermõõt on " + esimene.umbermoot());
        System.out.println("1. ringi pindala on " + esimene.pindala());
        System.out.println();
        Ring teine = new Ring(5);
        System.out.println(teine);
        System.out.println("2. ringi ümbermõõt on " + teine.umbermoot());
        System.out.println("2. ringi pindala on " + teine.pindala());
        System.out.println();
        Ring kolmas = new Ring(12.0, 0.0, 7, "punane");
        System.out.println(kolmas);
        System.out.println("3. ringi ümbermõõt on " + kolmas.umbermoot());
        System.out.println("3. ringi pindala on " + kolmas.pindala());
        System.out.println();
        System.out.print("1. ja 2. ");
        esimene.vordlus(teine);
        System.out.print("2. ja 3. ");
        teine.vordlus(kolmas);
        System.out.print("3. ja 1. ");
        kolmas.vordlus(esimene);
    }

    public double umbermoot() {
        return Math.round(2 * Math.PI * this.raadius * 100) / 100.0;
    }

    public double pindala() {
        return Math.round(Math.PI * Math.pow(this.raadius, 2) * 100) / 100.0;
    }

    public void vordlus(Ring teineRing) {
        double d = Math.sqrt(Math.pow((this.x - teineRing.x), 2) + Math.pow((this.y - teineRing.y), 2));
        if (this.raadius + teineRing.raadius == d) {
            System.out.println("ringidel on üks kokkupuute punkt");
        } else if (this.raadius + teineRing.raadius > d) {
            System.out.println("ringidel on ühine osa");
        } else {
            System.out.println("ringid asuvad üks teisest eemal");
        }
    }

    @Override
    public String toString() {
        return "Ringi " +
                "x koordinaat on " + this.x + " " +
                "y koordinaat on " + this.y + " " +
                "raadius on " + this.raadius + " " +
                "varv on " + this.varv;
    }
}