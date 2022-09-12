package aula34.labs;

public class Contador {
	private static int cont;  //esse atributos static ele é compartilhado com tds as instancia da classe.
	
	public Contador() {
		cont ++;
	}
	public static void incrementar() {
		
		cont++;
	}
	public static void zerar() {
		
		cont=0;
	}
	public static int obterValor() {
		return cont;
	}
}
