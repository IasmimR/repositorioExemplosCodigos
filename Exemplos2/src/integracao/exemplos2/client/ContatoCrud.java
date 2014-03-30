package integracao.exemplos2.client;

import java.util.List;

public interface ContatoCrud {
	void addContato(Contato contato);
	void deletaContato(Contato contato);
	void atualizaContato(Contato contato);
	List<Contato> listaContatos();
	}