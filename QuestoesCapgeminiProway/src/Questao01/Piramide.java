/**
 * @author Mateus Haverroth
 *
 */

package Questao01;

import javax.swing.JOptionPane;

public class Piramide {
	
	public static void main(String[] args) {
//Linha para inclus�o de um valor pelo usu�rio		
		String valor = JOptionPane.showInputDialog(
				"Digite um numero inteiro:");
//Por ser utilizado o swing, quest�o est�tica, necess�rio converter o dado de string -> Double
		double valorInteiro = Double.parseDouble(valor);
//La�o de repeti��o para o numero de linhas	
		for (int i = 1; i <= valorInteiro; i++) {
//La�o de repeti��o para a quantidade de espa�os antes do asterisco			
			for (int j = (int) (valorInteiro - i) ; j >= 1; j --)  
				System.out.print(" ");			
//La�o de repeti��o para o numero de asteriscos da piramide
			for (int k = 1 ; k <= i; k++)  
				System.out.print("*");	
//Necess�rio inclus�o para piramide continuar sempre na pr�xima linha
			System.out.println();	
		}	
	}
}