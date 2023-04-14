import java.util.Scanner;

public class Q1_GabrielLima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, soma;

        System.out.print("Digite o primeiro numero:  ");
        num1 = sc.nextInt();

        System.out.print("Digite o segundo numero:  ");
        num2 = sc.nextInt();
        soma = num1 + num2;

        System.out.println(soma);
    }
}