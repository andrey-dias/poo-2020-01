package a3003;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa A = new Pessoa("João da Silva");
		Pessoa B = new Pessoa("Maria de Jesus");
		
		System.out.println(A);
		System.out.println(B);
		
		A.setNome(B.getNome());
		
		System.out.println(A);
		System.out.println(B);

	}

}
