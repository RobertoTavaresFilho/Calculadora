package aula34.labs;

public class exer02 {

	public static void main(String[] args) {
		
		imprimirTela(Calculadora.soma(1, 2));
		imprimirTela(Calculadora.sub(2, 1));
		imprimirTela(Calculadora.multiplicar(2, 2));
		imprimirTela(Calculadora.div(4, 2));
		imprimirTela(Calculadora.elevarPot(2, 3));
	}
	
	//feito para não ficar fazendo system.out.print o tempo todo.
	static void imprimirTela(int num) {
		System.out.println(num);
	}
}
