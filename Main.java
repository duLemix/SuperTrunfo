import java.util.Scanner;
import java.util.Random;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main( String[] argamassaProAlmocoEhBomDemais ) {
		/* Perguntar o nome do jogador (e a idade
		 * e o CPF e o endereco */
		String pessoaNome;
		int qtdJogadores;
		Scanner pipipopo = new Scanner( System.in );
		System.out.printf( "Digite seu nome: " );
		pessoaNome = pipipopo.next();
		System.out.printf( "Escolha o numero de jogadores (2, 4 ou 6): \n" );
		qtdJogadores = pipipopo.nextInt();
		pipipopo.nextLine();
		pipipopo.close();

		/* Instanciar objetos para inicializar o jogo */
		Jogo gg = new Jogo();

		Jogador jogadorReal = new Jogador( pessoaNome );
		Jogador ehBot = new Jogador( "IA 1" );
		Jogador ehOutroBot = new Jogador( "IA 2" );
		Jogador ehOutroOutroBot = new Jogador( "IA 3" );
		Jogador ehOutroOutroOutroBot = new Jogador( "IA 4" );
		Jogador ehOutroOutroOutroOutroBot = new Jogador( "IA 5" );

		switch( qtdJogadores ) {
			case 2:
				gg.addJogador( jogadorReal );
				gg.addJogador( ehBot );
			case 4:
				gg.addJogador( jogadorReal );
				gg.addJogador( ehBot );
				gg.addJogador( ehOutroBot );
				gg.addJogador( ehOutroOutroBot );
			case 6:
				gg.addJogador( jogadorReal );
				gg.addJogador( ehBot );
				gg.addJogador( ehOutroBot );
				gg.addJogador( ehOutroOutroBot );
				gg.addJogador( ehOutroOutroOutroBot );
				gg.addJogador( ehOutroOutroOutroOutroBot );
			default:
				System.out.printf( "O valor digitado nao corresponde\n" );
				System.out.printf( "Reinicie o jogo. Voce merece sofrer por conta disso.\n" );
				System.exit( 1 );
		}

		/* Inicializador da rodada (eh aleatorio uau) */
		Random deezRandomNuts = new Random();
		System.out.printf( "Valor aleatorio de 0 a qtdJogadores: %d\n", deezRandomNuts.nextInt( qtdJogadores ) );

		/* Leitura e associacao de valores do arquivo .csv */
		String csvFile = "tema.csv";
		try ( BufferedReader deezReaderNuts = new BufferedReader( new FileReader( csvFile ) ) ) {
			/* Le o arquivo linha por linha */
			String linha;
			String delim = ";";
			linha = deezReaderNuts.readLine();
			while ( (linha = deezReaderNuts.readLine()) != null ) {
				// Process each line
				String[] valores = linha.split( delim );
				for( String e: valores ) {
					// Process each value
					System.out.printf( "%s\n", e );
				}
			}
		} catch ( IOException e ) {
			e.printStackTrace();
		}

	}
}
