import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaTemperaturas = 0;
        int contadorTemperaturas = 0;

        for (int i = 1; i <= 12; i++) {
            double temperatura;

            while (true) {
                System.out.print("Digite a temperatura " + i + " (entre 4 e 10): ");
                temperatura = scanner.nextDouble();

                if (temperatura >= 4 && temperatura <= 10) {
                    break;
                } else {
                    System.out.println("Temperatura inválida! A temperatura deve estar entre 4 e 10.");
                }
            }

            somaTemperaturas += temperatura;
            contadorTemperaturas++;
        }

        double media = somaTemperaturas / contadorTemperaturas;

        System.out.printf("A média de hoje das temperaturas é: %.1fº C\n", media);
        
        scanner.close();
    }
}
