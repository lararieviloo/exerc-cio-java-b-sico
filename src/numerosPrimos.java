import java.util.Scanner;

public class numerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        boolean primo = true;

        if (n <= 1) {
            primo = false;
        } else {

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        System.out.println(primo);
        scanner.close();
    }
}
