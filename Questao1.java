// Enunciado: Receba três notas, calcule e apresente a média aritmética delas.

import java.util.Scanner;

public class Questao1 { 

    public static void main(String args[]) { 

        Scanner input = new Scanner(System.in); 

        double nota1, nota2, nota3, media; 

        System.out.print("Digite a 1a nota: "); 
        nota1 = input.nextDouble(); 

        System.out.print("Digite a 2a nota: ");
        nota2 = input.nextDouble(); 

        System.out.print("Digite a 3a nota: ");
        nota3 = input.nextDouble(); 

        media = (nota1 + nota2 + nota3) / 3; 

        System.out.println("A média é: " + media); 

        input.close(); 
    }
}
