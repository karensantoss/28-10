
package br.com.model;

import java.util.Date;


public class Emprestimo {
    
    private int codigo;
    private String tipoPessoaP;
    private String tipoPessoaA;
    private String nome;
    private Dvd dvd;
    private Livro livro;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private Usuario usuario;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Dvd getDvd() {
        return dvd;
    }

    public void setDvd(Dvd dvd) {
        this.dvd = dvd;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getTipoPessoaP() {
        return tipoPessoaP;
    }

    public void setTipoPessoaP(String tipoPessoaP) {
        this.tipoPessoaP = tipoPessoaP;
    }

    public String getTipoPessoaA() {
        return tipoPessoaA;
    }

    public void setTipoPessoaA(String tipoPessoaA) {
        this.tipoPessoaA = tipoPessoaA;
    }

   

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

   
    
    
}
