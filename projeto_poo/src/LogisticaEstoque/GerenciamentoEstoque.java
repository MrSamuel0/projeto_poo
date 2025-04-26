/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogisticaEstoque;

import java.util.*;

/**
 *
 * @author samuel
 */
public class GerenciamentoEstoque {
    Map<Integer, Produto> produtos = new HashMap<>();
    
    public GerenciamentoEstoque () {}
    
    public GerenciamentoEstoque (int codigo, Produto produto) {
        this.produtos.put(codigo, produto);
    }
    
    public void atualizaProduto (int codigo, Produto prod) {
        produtos.replace(codigo, prod);
    }
    
    public void removeProduto (int codigo){
        produtos.remove(codigo);
    }
    
    
}
