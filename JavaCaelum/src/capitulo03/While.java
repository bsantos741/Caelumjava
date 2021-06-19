package capitulo03;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade = 14;
		
		while (idade < 22) { // Enquanto essa condição permanecer verdadeira, ele vai repetir o trecho de codigo
			System.out.println(idade);
			idade += 1;      //Sem esse trecho o loop é infinito
		}
	}

}
