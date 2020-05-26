import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 0;
        int sum = 0;
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Podaj liczbę całkowitą: ");
            x = scanner.nextInt();
            int result = x * x;
            if (result < 100) {
                sum += x;
            } else {
                loop = false;
            }
        } while (loop);

        sum = sum % 2;
        System.out.println("Wynik: " + sum);
    }
}
