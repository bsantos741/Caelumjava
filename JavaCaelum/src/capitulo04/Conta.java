package capitulo04;

public class Conta {
	int numero;
	String titular;
	double saldo;
	double salario;
	
	//void saca(double quantidade) { //variavel quantidade só existe nesse escopo
	//	double novoSaldo = this.saldo - quantidade;
	//	this.saldo = novoSaldo;
	//}
	void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	boolean saca(double valor) {        //o que vai dentro do argumento é declarado e usado dentro do escopo
		if (this.saldo < valor) {
			return false;
		}
		else {
			this.saldo = this.saldo - valor;
			return true;
		}
		
		
		
	}
}
