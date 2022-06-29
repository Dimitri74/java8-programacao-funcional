package javaProgamacaofuncional.exerc1.exerc8;

import org.junit.Test;

/**
 * @author Marcus Dimitri
 *
 */

public class Exer8 {
	
    /** Pizzaria polimorfica com strategy. **/
    @Test
    public void exer8() {
        Calabresa calabreza = new Calabresa();
        Napolitana napolitana = new Napolitana();
        Forno forno = new Forno();
        forno.assar(calabreza);
        forno.assar(napolitana);
    }
}


