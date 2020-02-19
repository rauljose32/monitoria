package monitora;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor");
        double v1 = scanner.nextDouble();

        System.out.println("Informe mais um valor");
        double v2 = scanner.nextDouble();

        System.out.println("a soma dos valores é: "+(v1 + v2));

    }//main
}
