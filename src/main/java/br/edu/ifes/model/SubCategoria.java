package br.edu.ifes.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_subcategoria")
public class SubCategoria {
    @Id
    @Column(name="IdSubCategoria")
    private Integer id;

    @Column(name="nomeCategoria")
    private String nomeCategoria;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idCategoria")
    private Categoria idCategoria;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }
}
