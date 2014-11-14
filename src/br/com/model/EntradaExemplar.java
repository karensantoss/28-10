
package br.com.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class EntradaExemplar {
    @Id @GeneratedValue
    
    private int codigo;
    private String usuario;
    private String tipoExemplar;
    private String tipoExemplar2;
    private int quantidade;
    @Temporal(TemporalType.DATE)
    private Date dataAquisicao;
    private String origem;
    private String nomeExemplar;
    private String observacao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTipoExemplar() {
        return tipoExemplar;
    }

    public void setTipoExemplar(String tipoExemplar) {
        this.tipoExemplar = tipoExemplar;
    }

    public String getTipoExemplar2() {
        return tipoExemplar2;
    }

    public void setTipoExemplar2(String tipoExemplar2) {
        this.tipoExemplar2 = tipoExemplar2;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getNomeExemplar() {
        return nomeExemplar;
    }

    public void setNomeExemplar(String nomeExemplar) {
        this.nomeExemplar = nomeExemplar;
    }
    
    
    
    
    
}
