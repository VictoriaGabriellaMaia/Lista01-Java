// Enunciado: Receba o valor do salário mínimo e o valor do salário de um funcionário. O algoritmo
// deve calcular e apresentar a quantidade de salários mínimos que esse funcionário recebe.

import java.util.Scanner; 

public class Questao5 { 

    public static void main(String args[]) { 

        Scanner input = new Scanner(System.in); 

        double salarioMinimo, salarioFuncionario, quantidade;

        System.out.print("Digite o valor do salário mínimo: "); 
        salarioMinimo = input.nextDouble(); 

        System.out.print("Digite o salário do funcionário: "); 
        salarioFuncionario = input.nextDouble(); 

        quantidade = salarioFuncionario / salarioMinimo; // Divide o salário do funcionário pelo salário mínimo, obtendo quantos salários mínimos ele recebe

        System.out.println("O funcionário recebe " + quantidade + " salários mínimos."); 
        
        input.close(); 
    }
}
