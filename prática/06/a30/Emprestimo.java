package a30;

public class Emprestimo {
	private Livro obra;
	private Pessoa funcionario;
	private Pessoa cliente;
	private String data;
	
	public Emprestimo(Livro obra, Pessoa funcionario, Pessoa cliente, String data) {
		setObra(obra);
		setFuncionario(funcionario);
		setCliente(cliente);
		setData(data);
	}
	@Override
	public String toString() {
		return "Emprestimo [obra=" + obra + ", funcionario=" + funcionario + ", cliente=" + cliente + ", data=" + data
				+ "]";
	}
	public Livro getObra() {
		return obra;
	}
	public void setObra(Livro obra) {
		this.obra = obra;
	}
	public Pessoa getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Pessoa funcionario) {
		this.funcionario = funcionario;
	}
	public Pessoa getCliente() {
		return cliente;
	}
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
}
