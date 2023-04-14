import java.util.Scanner;

public class Q3_GabrielLima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        float entrada, soma;
        soma = 0;
        System.out.print("Digite o numero de entradas: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Digite a entrada: ");
            entrada = sc.nextFloat();
            soma = entrada + soma;
        }
        System.out.println(soma);
    }
}