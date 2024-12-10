import java.util.Scanner;

public class contagemDeDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int count = 0;

        while (numero != 0) {
            numero /= 10;
            count++;
        }

        System.out.println("O número possui " + count + " dígitos.");
        scanner.close();
    }
}

