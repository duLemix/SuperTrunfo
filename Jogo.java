import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Jogo {
	private Jogador este;
	private PropertyChangeSupport ppt;

	public Jogo() {
		ppt = new PropertyChangeSupport( this );
	}

	/* Adicionar / remover jogadores do jogo
	 * ("lista de chamada") */
	public void addJogador( PropertyChangeListener p ) {
		ppt.addPropertyChangeListener( p );
	}
	public void rmJogador( PropertyChangeListener p ) {
		ppt.removePropertyChangeListener( p );
	}

	/* Disparar a proxima jogada */
	public void proximo( Jogador ligma ) {
		ppt.firePropertyChange( "Proximo jogador!", this.este, ligma );
		this.este = ligma;
	}
}
