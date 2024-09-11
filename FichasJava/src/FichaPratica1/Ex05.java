package FichaPratica1;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, num3, medAri, medPon;
        System.out.print ("Introduza um número: ");
        num1 = input.nextDouble();
        System.out.print ("Introduza outro número: ");
        num2 = input.nextDouble();
        System.out.print ("Introduza um terceiro número: ");
        num3 = input.nextDouble();
        medAri = (num1 + num2 + num3)/3;
        medPon = num1 * 0.2 + num2 * 0.3 + num3 * 0.5;
        System.out.println ("A média aritmétrica é igual a: " + medAri);
        System.out.println ("A média ponderada é igual a: " + medPon);

    }
}
