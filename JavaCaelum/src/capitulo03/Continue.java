package capitulo03;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			if (i > 50 && i < 60) {
				continue;
			}
			System.out.println(i); //N�o vai imprimir 51 a 59
		
		}
	}

}
