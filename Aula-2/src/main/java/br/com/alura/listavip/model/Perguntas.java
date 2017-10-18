package br.com.alura.listavip.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "perguntas")
public class Perguntas {
	
	@ManyToOne
	Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Perguntas() {
		// TODO Auto-generated constructor stub
	}
	
	public Perguntas(String pergunta, String traducao){
		this.pergunta = pergunta;
		this.traducao = traducao;
	}
	
	public String getTraducao() {
		return traducao;
	}

	public void setTraducao(String traducao) {
		this.traducao = traducao;
	}

	@Id
	@GeneratedValue
	private int id;
	
	private String pergunta;

	private int idpessoa;
	
	private String traducao;
	

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public int getIdpessoa() {
		return idpessoa;
	}

	public void setIdpessoa(int idessoa) {
		this.idpessoa = idessoa;
	}
	



}
