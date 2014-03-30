package integracao.exemplos2.client;

import java.util.List;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("contatos")
public interface ContacoServico extends RemoteService{
    List<Contato> listContatos();
    void adicionaContato(Contato contato);
    void deletaContato(Contato contato);
    void atualizaContato(Contato contato);
	
}
