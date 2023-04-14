import java.util.Scanner;

public class Q2_GabrielLima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, entrada, soma;
        soma = 0;
        System.out.print("Digite o numero de entradas: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Digite a entrada: ");
            entrada = sc.nextInt();
            soma = entrada + soma;
        }
        System.out.println(soma);
    }
}