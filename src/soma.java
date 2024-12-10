import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        int somar = 0;
        for (int i = 1; i <= n; i++) {
            somar += i;
        }

        System.out.println(somar);

        scanner.close();
    }
}
