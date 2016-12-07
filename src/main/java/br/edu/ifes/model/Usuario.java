package br.edu.ifes.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tb_usuario")
public class Usuario {
    @Id
    @Column(name="idUsuario")
    private Integer idUsuario;

    @Column(name="nomeUsuario")
    private String nomeUsuario;

    @Column(name="emailUsuario")
    private String emailUsuario;

    @Column(name="dataCadastro")
    private Date dataCadastro;

    @Column(name="senhaUsuario")
    private String senhaUsuario;

    @OneToOne
    @JoinColumn(name="idCategoria1")
    private Categoria categoria1;

    @OneToOne
    @JoinColumn(name="idCategoria2")
    private Categoria categoria2;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public Categoria getCategoria1() {
        return categoria1;
    }

    public void setCategoria1(Categoria categoria1) {
        this.categoria1 = categoria1;
    }

    public Categoria getCategoria2() {
        return categoria2;
    }

    public void setCategoria2(Categoria categoria2) {
        this.categoria2 = categoria2;
    }
}
