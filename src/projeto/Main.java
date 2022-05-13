package projeto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;

        int contador = 0;

        numero = scan.nextInt();

        while (numero != 0) {

            numero = (numero % 2 == 0) ? numero = numero / 2 : numero - 1;

            contador++;

        }

        System.out.println(contador);

    }

}
