// Enunciado: Receba uma temperatura em Celsius, calcule e mostre essa temperatura em Fahrenheit.
// OBS: F = (C * 1,8) + 32.

import java.util.Scanner; 

public class Questao4 { 

    public static void main(String args[]) { 

        Scanner input = new Scanner(System.in);

        double celsius, fahrenheit; 
        System.out.print("Digite a temperatura em Celsius: "); 
        celsius = input.nextDouble(); 

        fahrenheit = (celsius * 1.8) + 32; // Aplica a fórmula para converter a temperatura

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        input.close();
    }
}
