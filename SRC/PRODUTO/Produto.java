/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produto;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author IFPR
 */
public class Produto {
    
    private int id;
    private String nome;
    private Date dataFabricacao;
    private int validade;
    private int quantidade;
    private BigDecimal preco;

    
    
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public int getValidade() {
        return validade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }
    
    
    
    
}
