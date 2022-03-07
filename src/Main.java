
public class Main {

	public static void main(String[] args) {
		Cliente elias = new Cliente();
		elias.setnome("Elias");
		
		ContaCorrente cc = new ContaCorrente(elias);
		ContaPoupança poupança = new ContaPoupança(elias);
		
		cc.depositar(100);
		cc.tranferir(100, poupança);
		
		cc.imprimirExtrato();
		poupança.imprimirExtrato();

	}

}
