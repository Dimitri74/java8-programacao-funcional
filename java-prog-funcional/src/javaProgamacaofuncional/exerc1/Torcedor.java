package javaProgamacaofuncional.exerc1;

public interface Torcedor {

	String getNomeTime();

	default void torcer() {
		System.out.println("Torçendo para meu time " + getNomeTime());
	}
}

