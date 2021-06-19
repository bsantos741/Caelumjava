package capitulo03;

public class BalancaTrimestral {
	
	public static void main(String[] args) {
		
		int gastoJaneiro = 15000;
		int gastoFevereiro = 23000;
		int gastoMarco = 17000;
		int gastosTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;
		
		System.out.println(gastosTrimestre);
		
		int mediaPorMes = gastosTrimestre/3;
		System.out.println(mediaPorMes);
	}
}
