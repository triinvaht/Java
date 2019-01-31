public class KolmnurkTasandil {
    public static void main(String[] args) {
        Punkt punktA = new Punkt(0, 2);
        Punkt punktB = new Punkt(1, 0);
        Punkt punktC = new Punkt(-1, 0);

        Sirge sirgeA = new Sirge(punktA, punktB);
        Sirge sirgeB = new Sirge(punktB, punktC);
        Sirge sirgeC = new Sirge(punktC, punktA);

        Kolmnurk kolmnurk0 = new Kolmnurk();
        Kolmnurk kolmnurk1 = new Kolmnurk(punktA, punktB, punktC);
        Kolmnurk kolmnurk2 = new Kolmnurk(sirgeA, sirgeB, sirgeC);


        System.out.println(kolmnurk0);
        System.out.println(kolmnurk1);
        System.out.println(kolmnurk2);
    }
}