public class Main {
    
    public static void main(String[] args) {
		Cliente Yoongi = new Cliente();
		Yoongi.setNome("Yoongi");
		
		Conta cc = new ContaCorrente(Yoongi);
		Conta poupanca = new ContaPoupanca(Yoongi);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}  
}
