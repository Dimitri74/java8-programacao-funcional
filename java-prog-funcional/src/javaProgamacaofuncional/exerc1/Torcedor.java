package javaProgamacaofuncional.exerc1;

public interface Torcedor {

	String getNomeTime();

	default void torcer() {
		System.out.println("Tor�endo para meu time " + getNomeTime());
	}
}

