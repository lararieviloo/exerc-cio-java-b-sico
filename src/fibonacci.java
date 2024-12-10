import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        System.out.print("Série de Fibonacci: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a);
            if (i < n - 1) {
                System.out.print(", ");
            }
            int temp = a;
            a = b;
            b = temp + b;
        }

        System.out.println();
        scanner.close();
    }
}
