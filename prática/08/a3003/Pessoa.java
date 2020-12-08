package a3003;

public class Pessoa {
	private String nome;
	
	public Pessoa(String nome) {
		setNome(nome);
	}
	@Override
	public String toString() {
		return getNome();
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
