
public class Exercise2 {
    public static int[] seade(int seadeNumber, int detailideArv) {
        int detailid[] = new int[detailideArv]; // detailide massiiv
        for (int i = 0; i < detailideArv; i++) {
            if (seadeNumber == 1) {
                detailid[i] = (i % 2 == 0) ? 1 : 0;
            } else if (seadeNumber == 2) {
                detailid[i] = (i % 3 == 0) ? 1 : 0;
            } else {
                detailid[i] = 0;
            }
        }
        return detailid;
    }

    public static void kontroll(int[] esimeneSeade, int[] teineSeade) {
        int labiValgustatud = 0;
        for (int i = 0; i < esimeneSeade.length; i++) {
            if (esimeneSeade[i] == 1 || teineSeade[i] == 1) {
                labiValgustatud += 1;
            }
        }
        System.out.print("Detailid konveierilt \t");
        for (int i = 0; i < esimeneSeade.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.print("\nesimene seade \t\t\t");
        for (int i = 0; i < esimeneSeade.length; i++) {
            System.out.print((esimeneSeade[i] == 1 ? "+" : " ") + "\t");
        }
        System.out.print("\nteine seade \t\t\t");
        for (int i = 0; i < teineSeade.length; i++) {
            System.out.print((teineSeade[i] == 1 ? "+" : " ") + "\t");
        }
        System.out.println("\nLäbivalgustatud on " + labiValgustatud * 100.0 / esimeneSeade.length + "% ja valgustamata on " + (100.0 - (labiValgustatud * 100.0 / esimeneSeade.length)) + "%");
    }

    public static void main(String[] args) {
        kontroll(seade(1, 10), seade(2, 10));
    }
}