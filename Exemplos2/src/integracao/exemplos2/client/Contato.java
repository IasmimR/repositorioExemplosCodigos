package integracao.exemplos2.client;

import java.io.Serializable;

public class Contato implements Serializable {
	
	private static final long serialVersionUID = 1L;
	String nome;
	String email;


	public Contato(String nome, String email) {
	        this.nome = nome;
	        this.email = email;
	    }
	
	String getNome(String nome){
		return nome;
	}
	String getEmail(){
		return email;
	}
	
	void setNome(String nome) {
        this.nome = nome;
	}
	void setEmail(String email) {
        this.email = email;
	}
	
	
}


