package a30;

public class Editora {
	private String nome;
	private String local;
	private int anoFundacao;
	
	public Editora (String nome, String local, int anoFundacao) {
		setNome(nome);
		setLocal(local);
		setAnoFundacao(anoFundacao);
	}

	@Override
	public String toString() {
		return "Editora [nome=" + nome + ", local=" + local + ", anoFundacao=" + anoFundacao + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getAnoFundacao() {
		return anoFundacao;
	}

	public void setAnoFundacao(int anoFundacao) {
		this.anoFundacao = anoFundacao;
	}
	
}
