package exercicios;

import java.util.Scanner;

//Faça um progtrama que peça N numeros inteiros,
//Mostrar a quantidade de numeros pares e impares


public class NumerosParImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int quantPares = 0,
                quantImpares = 0,
                quantNumeros,
                numero;

        System.out.println("Quantidade de numeros: ");
        quantNumeros = scan.nextInt();

        int count = 1;
        do {
            System.out.println("Digite o numero " + count);
            numero = scan.nextInt();
            if (numero % 2 == 0) quantPares++;
            else quantImpares++;
            count++;

        } while (count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Par: " + quantImpares);

    }
}
