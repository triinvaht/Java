import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Sisesta üks arv: ");
        Scanner scanner = new Scanner(System.in);
        String sisend = scanner.nextLine();
        scanner.close();

        int summa = 0;
        for (int i = 0; i < sisend.length(); i++) {
            char symbol = sisend.charAt(i);
            summa = summa + Character.digit(symbol, 10);
        }
        System.out.println("Arvu " + sisend + " numbrite summa on " + summa);
    }
}