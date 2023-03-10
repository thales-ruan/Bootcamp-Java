package exercicios;

import java.util.Scanner;

//Desenvolver um gerador de tabuada
//Gerar tabuada de 1 a 10
//O usuario deve informar de qual numero ele deseja ver a tabuada
//A saída deve ser ex
// 5 x 1 = 5
// 5 x 2 = 10
public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for (int i = 1; i <= 10; i++) {
            int x = tabuada * i;
            System.out.println(tabuada + " X " + i + " = " + x);
        }
    }
}
