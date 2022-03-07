
public class Main {

	public static void main(String[] args) {
		Cliente elias = new Cliente();
		elias.setnome("Elias");
		
		ContaCorrente cc = new ContaCorrente(elias);
		ContaPoupanša poupanša = new ContaPoupanša(elias);
		
		cc.depositar(100);
		cc.tranferir(100, poupanša);
		
		cc.imprimirExtrato();
		poupanša.imprimirExtrato();

	}

}
