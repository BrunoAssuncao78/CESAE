package FichaPratica1;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int valor1, valor2, permuta;
        System.out.print ("Introduza o primeiro número: ");
        valor1 = input.nextInt();
        System.out.print ("Introduza o segundo número: ");
        valor2 = input.nextInt();
        //permuta = valor1;
        //valor1 = valor2;
        //valor2 = permuta;
        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;
        System.out.println ("O primeiro número agora é: " + valor1);
        System.out.println ("O segundo número agora é: " + valor2);


    }
}
