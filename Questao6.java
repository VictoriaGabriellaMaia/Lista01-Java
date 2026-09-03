// Enunciado: Receba os valores dos dois catetos de um triângulo, calcule e apresente o valor da hipotenusa.
// OBS - Teorema de Pitágoras: a2 = b2 + c2.

import java.util.Scanner; 

public class Questao6 { 

    public static void main(String args[]) { 

        Scanner input = new Scanner(System.in); 

        double catetoB, catetoC, hipotenusa;

        System.out.print("Digite o valor do cateto b: "); 
        catetoB = input.nextDouble(); 

        System.out.print("Digite o valor do cateto c: "); 
        catetoC = input.nextDouble(); 

        // a² = b² + c²  ->  a = raiz quadrada de (b² + c²)
  
        hipotenusa = Math.sqrt(Math.pow(catetoB, 2) + Math.pow(catetoC, 2)); // Calcula a hipotenusa usando Pitágoras

        System.out.println("O valor da hipotenusa é: " + hipotenusa); 

        input.close(); 
    }
}
