package integracao.exemplos2.server;

import java.util.*;

import integracao.exemplos2.client.*;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class ContatoServicoImplementacao extends RemoteServiceServlet implements ContacoServico {
	Contato contato;
	private static final long serialVersionUID = 1L;
	private ContatoCrud contatoCrud = new ContatoCrudSimulacao();

    public void addContact(Contato contact) {
    	contatoCrud.addContato(contato);
    }

    public List<Contato> listaContatos() {
        List<Contato> listaContatos = contatoCrud.listaContatos();
        return new ArrayList<Contato> (listaContatos);
    }

    public void deletaContato(Contato contact) {
    	contatoCrud.deletaContato(contato);
    
    }

    public void atualizaContato(Contato contact) {
    	contatoCrud.atualizaContato(contato);
    }

	@Override
	public List<Contato> listContatos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adicionaContato(Contato contato) {
		// TODO Auto-generated method stub
		
	}
    

	
}
