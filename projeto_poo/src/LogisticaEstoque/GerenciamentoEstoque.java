/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogisticaEstoque;

import Bet_poo.InOut;
import java.util.*;

/**
 *
 * @author samuel
 */
public class GerenciamentoEstoque {
    Map<Integer, Produto> produtos = new HashMap<>();
    
    public void adcionarProd (int codigo, Produto produto) {
        this.produtos.put(codigo, produto);
    }
    
    public void atualizaProduto (int codigo, Produto prod) {
        produtos.replace(codigo, prod);
    }
    
    public void removeProduto (int codigo){
        produtos.remove(codigo);
    }
    
    public void reltorioProd () {
        for (Map.Entry<Integer, Produto> field : produtos.entrySet()) {
            Produto produto = field.getValue();
            InOut.MsgDeAviso(produto.nome, produto.nome);
            
        }
    }
    
    public void verProd (int codigo) {
        Produto prod = produtos.get(codigo);
        
        InOut.MsgDeAviso(prod.nome, "Nome: " + prod.nome + ", Tipo: " + 
        prod.tipo_produto + ", Custo: " + prod.preco_custo + ", Preco venda: " 
        + prod.preco_venda + ", Quantidade vendida: " + prod.qtd_vend + 
        ", Quantidade: " + prod.quantidade);
    }
    
    public void relatorioCompleto (int codigo) {
        Produto prod = produtos.get(codigo);
        
        String frase = ("Nome: " + prod.nome + ", Tipo: " + 
        prod.tipo_produto + ", Custo: " + prod.preco_custo + ", Preco venda: " 
        + prod.preco_venda + ", Quantidade vendida: " + prod.qtd_vend + 
        ", Quantidade: " + prod.quantidade);
        
        Double valorTotal = prod.qtd_vend * prod.preco_venda;
        
        Double lucro = valorTotal - (prod.preco_custo * prod.qtd_vend);
        
        InOut.MsgDeAviso("Informacoes " + prod.nome, frase + ", Valor total: " + valorTotal + ", Lucro:" + lucro);
        
    }
    
    
}
