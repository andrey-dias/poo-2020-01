package a30;

public class TestaEmprestimo {

	public static void main(String[] args) {
		Editora editora = new Editora("ABC", "Goiânia", 1959);
		Pessoa autor = new Pessoa("Machado de Assis", 1839);
		Livro domCasmurro	= new Livro("Dom Casmurro", 1899, editora, autor);
		
		Pessoa func = new Pessoa("Carlos", 1980);
		Pessoa cliente = new Pessoa("Diego", 1985);
		Emprestimo emprest = new Emprestimo(domCasmurro, func, cliente, "07/12/2020");
		System.out.println(emprest);

	}

}
