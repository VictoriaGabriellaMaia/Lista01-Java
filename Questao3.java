// Enunciado: Calcule e apresente a área de um losango. As diagonais maior e menor do losango
// devem ser informadas pelo usuário. OBS: AREA = (DIAGONAL MAIOR * DIAGONAL MENOR) / 2.

import java.util.Scanner; 

public class Questao3 { 

    public static void main(String args[]) { 

        Scanner input = new Scanner(System.in); 

        double diagonalMaior, diagonalMenor, area; 

        System.out.print("Digite a diagonal maior: "); 
        diagonalMaior = input.nextDouble(); 

        System.out.print("Digite a diagonal menor: "); 
        diagonalMenor = input.nextDouble(); 

        area = (diagonalMaior * diagonalMenor) / 2; 

        System.out.println("A área do losango é: " + area); 

        input.close(); 
    }
}
