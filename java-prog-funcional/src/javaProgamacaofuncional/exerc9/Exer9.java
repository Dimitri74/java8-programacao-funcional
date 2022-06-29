/**
 * 
 */
package javaProgamacaofuncional.exerc9;

import org.junit.Test;

import javaProgamacaofuncional.exerc1.exerc8.Forno;

/**
 * @author Marcus Dimitri
 *
 */

/** Pizzaria com lambda **/

public class Exer9 {

	@Test
	public void exer9() {

		Forno forno = new Forno();
		// explicar aqui que não precisa mais criar uma classe que implemente a
		// interface...vc passa o lambada
		// e ele faz isso pra vc automatico

		forno.assar(() -> System.out.println("pizza lambda"));
		forno.assar(() -> {
			System.out.println("molho lambda");
			System.out.println("queijo lambda");
			System.out.println("azeitona lambda");
		});
	}

}
