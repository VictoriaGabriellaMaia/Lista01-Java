// Enunciado: Faça um programa que receba o salário de um funcionário, calcule e mostre o novo
// salário, sabendo-se que ele teve um aumento de 25%.

import java.util.Scanner; 

public class Questao2 { 

    public static void main(String args[]) { 

        Scanner input = new Scanner(System.in); 

        double salario, novoSalario; 

        System.out.print("Digite o salário do funcionário: "); 
        salario = input.nextDouble(); 

        novoSalario = salario * 1.25; // Calcula o novo salário multiplicando por 1.25 (ou seja, aumento de 25%)

        System.out.println("O novo salário é: " + novoSalario); 

        input.close(); 
    }
}
