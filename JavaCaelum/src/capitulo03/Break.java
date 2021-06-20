package capitulo03;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 100; i++ ) {
			if (i % 19 == 0 ) {
				System.out.println("Achei um divisivel por 19 entre 1 e 100");
				break; //sem o break ele repetirial a mensagem 5 vezes
			}
		}
	}

}
