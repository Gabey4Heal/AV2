import java.util.Scanner;
 import java.util.Arrays;


public class Q4_GabrielLima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma String: ");
        String str = input.nextLine();
        String[] tokens = str.split(" ");
        System.out.println("Array de tokens: " + Arrays.toString(tokens));
        System.out.print("Tokens que começam com 's': ");
        for (String token : tokens) {
            if (token.startsWith("s") || token.startsWith("S")) {
                System.out.print(token + " ");
            }
        }
        input.close();
    }

}