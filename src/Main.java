
public class Main {

	public static void main(String[] args) {
		Cliente elias = new Cliente();
		elias.setnome("Elias");
		
		ContaCorrente cc = new ContaCorrente(elias);
		ContaPoupan�a poupan�a = new ContaPoupan�a(elias);
		
		cc.depositar(100);
		cc.tranferir(100, poupan�a);
		
		cc.imprimirExtrato();
		poupan�a.imprimirExtrato();

	}

}
