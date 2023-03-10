package exercicios;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int media = 0;

        int count = 0;

        do {
            System.out.println("Digite um numero");
            numero = scan.nextInt();

            if(numero > maior)maior = numero;


            media += numero;


            count++;

        } while (count < 5);
        System.out.println("O numero maior é: "+maior);
        System.out.println("A média dos numeros é: "+(media/5));
    }
}
