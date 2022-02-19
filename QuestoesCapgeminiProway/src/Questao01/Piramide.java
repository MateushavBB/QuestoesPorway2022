/**
 * @author Mateus Haverroth
 *
 */

package Questao01;

import javax.swing.JOptionPane;

public class Piramide {
	
	public static void main(String[] args) {
//Linha para inclusão de um valor pelo usuário		
		String valor = JOptionPane.showInputDialog(
				"Digite um numero inteiro:");
//Por ser utilizado o swing, questão estética, necessário converter o dado de string -> Double
		double valorInteiro = Double.parseDouble(valor);
//Laço de repetição para o numero de linhas	
		for (int i = 1; i <= valorInteiro; i++) {
//Laço de repetição para a quantidade de espaços antes do asterisco			
			for (int j = (int) (valorInteiro - i) ; j >= 1; j --)  
				System.out.print(" ");			
//Laço de repetição para o numero de asteriscos da piramide
			for (int k = 1 ; k <= i; k++)  
				System.out.print("*");	
//Necessário inclusão para piramide continuar sempre na próxima linha
			System.out.println();	
		}	
	}
}