import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        int fatorial = 1;
        int i = n;

        while (i > 0) {
            fatorial *= i;
            i--;
        }

        System.out.println(fatorial);

        scanner.close();
    }
}
