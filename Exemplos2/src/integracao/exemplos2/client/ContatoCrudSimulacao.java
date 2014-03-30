package integracao.exemplos2.client;

import integracao.exemplos2.client.Contato;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class ContatoCrudSimulacao implements ContatoCrud {
	
	Map<String, Contato> map = new LinkedHashMap<String, Contato>();
	    
	    {
	        map.put("disciplinas.ufg@gmail.com", 
	          new Contato("Fábio Nogueira", "disciplinas.ufg@gmail.com"));
	        map.put("programadoresifetrv@gmail.com", 
	  	          new Contato("Iasmim Ribeiro", "programadoresifetrv@gmail.com"));
	    }
	    
	    public void adicionarContato(Contato contato) {
	        String email = contato.getEmail();//chave
	        map.put(email, contato);
	    }
	    public List<Contato> listaContato() {
	        return Collections.unmodifiableList(new ArrayList<Contato>(map.values()));
	    }

	    public void deletarContato (Contato contato) {
	        map.remove(contato.getEmail()); //remove a chave
	    }

	    public void atualizarContato(Contato contato) {        
	        map.put(contato.getEmail(), contato);
	    }
		@Override
		public void addContato(Contato contato) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void deletaContato(Contato contato) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void atualizaContato(Contato contato) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public List<Contato> listaContatos() {
			// TODO Auto-generated method stub
			return null;
		}

	    

}
