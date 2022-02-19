/**
 * @author Mateus Haverroth
 *
 */

package Questao03;
import java.util.Arrays;
import java.util.HashMap;
  
public class Anagramas {
	
    public static void main(String[] args) {
//Palavra que seram contabilizados os sub pares        
    //--------- --------------------//	
    /*-*/subPares("ifailuhkqq");/*-*/
    //----------------------------//
    
    }
  
    static void subPares(String palavra){
        HashMap<String, Integer> mapa= new HashMap<>();
//método de junção de pares dentro de um array 
        for(int i = 0; i < palavra.length(); i++){
            for(int j = i; j < palavra.length(); j++){
                char[] valCalculado = palavra.substring(i, j+1).toCharArray();
                Arrays.sort(valCalculado);
                String valor = new String(valCalculado);
                if (mapa.containsKey(valor)) 
                	mapa.put(valor, mapa.get(valor)+1);
                else 
                	mapa.put(valor, 1);
            }
        }
// contador de pares
        int contadorDePares = 0;
        for(String key: mapa.keySet()){
            int n = mapa.get(key);
            contadorDePares += (n * (n-1))/2;
        }
        System.out.println("Numero de pares para a palavra '"+contadorDePares+"'");
    }
}