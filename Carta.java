public class Carta {
	private String nome;
	private String codigo;

	public Carta( String ligma, String balls ) {
		this.nome = ligma;
		this.codigo = balls;
	}

	public String toString() {
		return this.getNome() + " " +this.getCodigo(); 
	}

	/* Get & Set */
	public void setNome( String n ) {
		this.nome = n;
	}
	public String getNome() {
		return nome;
	}

	public void setCodigo( String c ) {
		this.codigo = c;
	}
	public String getCodigo() {
		return codigo;
	}

}
