import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Jogador implements PropertyChangeListener {
	private String nome;
	private Baralho monte;

	public Jogador( String deezNuts ) {
		this.nome = deezNuts;
	}

	/* `prox` indica a noticia de que houve mudanca de jogador */
	public void propertyChange( PropertyChangeEvent prox ) {
		Jogador vez = (Jogador) prox.getNewValue();
		if( vez == this )
			System.out.println( "Jogador " + this.getNome()  + ": \"Opa, eh a minha vez!\"" );
	}
}
