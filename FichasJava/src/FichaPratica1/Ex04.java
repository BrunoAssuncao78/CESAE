package FichaPratica1;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double raio, area;
        System.out.print ("Introduza o valor do raio: ");
        raio = input.nextDouble();
        area = 3.14 * raio * raio;
        System.out.print ("A área da circunferência é: " + area);

    }
}
