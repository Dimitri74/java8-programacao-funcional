/**
 * 
 */
package javaProgamacaofuncional.exerc10;

import org.junit.Test;

/**
 * @author Marcus Dimitri
 *
 */
public class Exer10 {
	
	
	public void calcular(Operacao m) {
        System.out.println(m.operar(10, 20));
    }
	
	@Test
	public void exerc10() {
		
		calcular((v1 ,v2) -> v1 + v2);
		calcular((v1 ,v2) -> v1 * v2);
		
	 
		
		
	}

}
