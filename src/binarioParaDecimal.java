import java.util.Scanner;

public class binarioParaDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número binário: ");
        String binario = scanner.nextLine();

        int decimal = Integer.parseInt(binario, 2);

        System.out.println("O número decimal correspondente a " + binario + " é: " + decimal);

        scanner.close();
    }
}
