package FichaPratica1;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, resultado;
        System.out.print ("Introduza um número inteiro: ");
        num1 = input.nextInt();
        System.out.print ("Introduza outro número inteiro: ");
        num2 = input.nextInt();
        resultado = num1 + num2;
        System.out.println (" A soma é igual a: " + resultado);
        resultado = num1 - num2;
        System.out.println (" A subtração é igual a: " + resultado);
        resultado = num1 * num2;
        System.out.println (" A multiplicação é igual a: " + resultado);
        resultado = num1 / num2;
        System.out.println (" A divisão é igual a: " + resultado);

    }
}
