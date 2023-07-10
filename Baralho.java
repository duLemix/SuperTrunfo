import java.util.LinkedList;
import java.util.Collections;

public class Baralho extends LinkedList<Carta> {
	private String tema;
	
	public Baralho (String tema) {
		this.tema = tema;
	    }

	
	public void distribuir( Jogador[] j ) {
		for(int i = 0; i < j.length; i++) {
			j[i].setMonte( new Baralho( this.getTema() ) );
		}
		while( this.size() != 0 ) {
			for ( Jogador deezNuts: j ) {
				deezNuts.getMonte().add( this.pollFirst() );
			}
		}
	}

	public void embaralhar() {
		Collections.shuffle(this);
	}
	
	public void adicionarCarta( Carta carta ) {
		this.add( carta );
	}
	public void removerCarta( Carta carta ) {
		this.remove( carta );
	}
	
	public Carta pegarDoTopo() {
		if( this.size() != 0 ) {
			Carta cartapuxada = this.pollFirst();
			return cartapuxada;
		} else {
			System.out.println("O monte nÃ£o tem mais cartas!");
			return null;
		}
	}

	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
}
