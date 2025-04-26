/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogisticaEstoque;

import java.util.HashMap;

/**
 *
 * @author samuel
 */
public class Produto {
    String nome;
    int quantidade;
    Double preco_custo;
    int qtd_vend;
    Double preco_venda;
    String tipo_produto;
    
    public Produto () {}
    
    public Produto (String nome, int qtd, Double precoC, int qtdV, Double precoV, String tipo) {
        this.nome = nome;
        this.quantidade = qtd;
        this.preco_custo = precoC;
        this.qtd_vend = qtdV;
        this.preco_venda = precoV;
        this.tipo_produto = tipo;
    }
    
    

}
