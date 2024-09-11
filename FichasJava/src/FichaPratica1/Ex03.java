package FichaPratica1;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double larg, comp, peri, area;
        System.out.print ("Introduza a largura do retângulo: ");
        larg = input.nextDouble();
        System.out.print ("Introduza o comprimento do retângulo: ");
        comp = input.nextDouble();
        peri = 2 * (larg + comp);
        System.out.println ("O perímetro do retângulo é  igual a: " + peri);
        area = larg * comp;
        System.out.print ("A área do retângulo é  igual a: " + area);

    }
}
