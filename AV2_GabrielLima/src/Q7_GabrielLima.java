import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q7_GabrielLima {
    public static void main(String[] args) {
        File file = new File("numeros.txt");
        try {
            Scanner scanner = new Scanner(file);
            int soma = 0;
            while (scanner.hasNextInt()) {
                int numero = scanner.nextInt();
                soma += numero;
            }
            scanner.close();
            System.out.println("A soma dos números é: " + soma);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }
    }
}