/**
 * @author Mateus Haverroth
 *
 */
package Questao02;

import javax.swing.JOptionPane;


public class SenhaInscrissao {

	public static void main(String[] args) {

		String senha = JOptionPane.showInputDialog(
				"Nova senha: ");
//lista de strings requiridas e permitidas			
        final String requeridos = "^(?:(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+()*!]).*)$";
        final String permitidos = "[a-zA-Z0-9!-@-#-$-%-^-&-*-(-)---+-]+";
        
//validador dos requisitos da senha
            if(senha.length() >=6  && senha.matches(permitidos) && senha.matches(requeridos)){
                System.out.println("Senha cadastrada com sucesso!");
            } else {
            	if(senha.length() < 6) {
                System.out.println("Senha curta insira "+(6-senha.length())+" Caractéres");
            	} else {
            	System.out.println("Senha não cumpre os requisitos de dificudade!");	
            	}
            }
	}
}
