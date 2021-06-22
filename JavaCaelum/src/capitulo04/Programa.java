package capitulo04;

public class Programa {

	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
		
		minhaConta.titular = "Duke";
		minhaConta.saldo = 1000.0;
		
		//minhaConta.saca(200);
		
		minhaConta.deposita(500);
		System.out.println("Saldo atual: "+minhaConta.saldo);
		
		boolean consegui = minhaConta.saca(2000);
		if (consegui) {
			System.out.println("Consegui sacar");
		}
		else {
			System.out.println("Não consegui sacar");
		}
	}
}
