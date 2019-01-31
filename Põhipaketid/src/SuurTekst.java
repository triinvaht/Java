public class SuurTekst {
    public static void main(String[] args) {
        String smallText = "aaa";

        for (int row = 0; row < 5; row++) {
            for (int i = 0; i < smallText.length(); i++) {
                if (Tahestik.getAlphabet().containsKey(smallText.charAt(i))) {
                    String symbol[] = Tahestik.getAlphabet().get(smallText.charAt(i));
                    System.out.print(symbol[row]);
                }
            }
            System.out.println();
        }

    }
}