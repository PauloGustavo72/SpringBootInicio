package br.com.alura.listavip.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "traducao")
public class Traducao {
	public Traducao() {
		// TODO Auto-generated constructor stub
	}
	
	public Traducao(String traducao) {
		this.traducao = traducao;
	}
	@Id
	@GeneratedValue
	private int id;
	
	private String traducao;
	
	

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTraducao() {
		return traducao;
	}

	public void setTraducao(String traducao) {
		this.traducao = traducao;
	}

		
	
}
