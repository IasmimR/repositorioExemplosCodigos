package integracao.exemplos2.client;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ContacoServicoAsync {

	void adicionaContato(Contato contato, AsyncCallback<Void> callback);

	void atualizaContato(Contato contato, AsyncCallback<Void> callback);

	void deletaContato(Contato contato, AsyncCallback<Void> callback);

	void listContatos(AsyncCallback<List<Contato>> callback);

}
