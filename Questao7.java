//Receba o raio, calcule e apresente:
//a. O comprimento de uma circunferência: C = 2 * π * R.
//b. A área de um círculo: A = π * R2
//c. A área da superfície de uma esfera: A = 4 * π * R2
//d. O volume de uma esfera: V = 4/3 * π * R3.

import java.util.Scanner;

public class Questao7 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        double raio;
        double comprimento, areaCirculo, areaEsfera, volumeEsfera;

        System.out.print("Digite o raio: ");
        raio = input.nextDouble();

        comprimento = 2 * Math.PI * raio;

        areaCirculo = Math.PI * Math.pow(raio, 2);

        areaEsfera = 4 * Math.PI * Math.pow(raio, 2);

        volumeEsfera = (4.0 / 3) * Math.PI * Math.pow(raio, 3);

        System.out.println("Comprimento da circunferência: " + comprimento);
        System.out.println("Área do círculo: " + areaCirculo);
        System.out.println("Área da superfície da esfera: " + areaEsfera);
        System.out.println("Volume da esfera: " + volumeEsfera);

        input.close();
    }
}
