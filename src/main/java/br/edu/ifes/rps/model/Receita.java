package br.edu.ifes.rps.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_Receita")
public class Receita {

	@Id
	@Column(name="IdReceita")
	@GeneratedValue
	private int id;
	
	@Column(name="NomeReceita")
	private String nomeReceita;
	
	@Column(name="IngReceita")
	private String ingredientes;
	
	@Column(name="ModoPreparo")
	private String modoPreparo;
	
	@Column(name="linkImagem")
	private String linkImagem;
	
	/*
	 * Possui os Ids de SubCategoria e Usuario, pois @Join esta aqui
	 * 
	 */
	@OneToOne
	@JoinColumn(name="IdSubCategoria", referencedColumnName = "IdSubCategoria")
	private SubCategoria subcategoria;
	
	@OneToOne
	@JoinColumn(name="IdUsuario", referencedColumnName= "IdUsuario", nullable = true)
	private Usuario usuario;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeReceita() {
		return nomeReceita;
	}

	public void setNomeReceita(String nomeReceita) {
		this.nomeReceita = nomeReceita;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getModoPreparo() {
		return modoPreparo;
	}

	public void setModoPreparo(String modoPreparo) {
		this.modoPreparo = modoPreparo;
	}

	public String getLinkImagem() {
		return linkImagem;
	}

	public void setLinkImagem(String linkImagem) {
		this.linkImagem = linkImagem;
	}
	

	
	
	
	
	
}