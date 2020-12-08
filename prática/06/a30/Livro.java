package a30;

public class Livro {
	private String titulo;
	private int anoPublicado;
	private Editora editora;
	private Pessoa autor;
	
	public Livro(String titulo, int anoPublicado, Editora editora, Pessoa autor) {
		setTitulo(titulo);
		setAnoPublicado(anoPublicado);
		setEditora(editora);
		setAutor(autor);
	}
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", anoPublicado=" + anoPublicado + ", editora=" + editora + ", autor="
				+ autor + "]";
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAnoPublicado() {
		return anoPublicado;
	}
	public void setAnoPublicado(int anoPublicado) {
		this.anoPublicado = anoPublicado;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	public Pessoa getAutor() {
		return autor;
	}
	public void setAutor(Pessoa autor) {
		this.autor = autor;
	}
	
}
