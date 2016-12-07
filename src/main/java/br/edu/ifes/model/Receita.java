package br.edu.ifes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_Receita")
public class Receita {
    @Id
    @Column(name = "idReceita")
    private Integer id;

    @Column(name = "nomeReceita")
    private String nomeReceita;

    @Column(name = "ingReceita")
    private String ingReceita;

    @Column(name = "modoPreparo")
    private String modoPreparo;

    @Column(name = "linkImagem")
    private String linkImagem;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeReceita() {
        return nomeReceita;
    }

    public void setNomeReceita(String nomeReceita) {
        this.nomeReceita = nomeReceita;
    }

    public String getIngReceita() {
        return ingReceita;
    }

    public void setIngReceita(String ingReceita) {
        this.ingReceita = ingReceita;
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
