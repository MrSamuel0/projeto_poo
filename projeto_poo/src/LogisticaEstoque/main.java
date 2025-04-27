/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogisticaEstoque;

/**
 *
 * @author samuel
 */
public class main {
    public static void main(String[] args) {
        GerenciamentoEstoque estoque = new GerenciamentoEstoque();
        Produto pr1 = new Produto("Notebook Lenovo", 10, 2500.00, 5, 3500.00, "Eletrônico");
        Produto pr2 = new Produto("Camiseta Polo", 50, 30.00, 20, 59.90, "Vestuário");
        Produto pr3 = new Produto("Cafeteira Elétrica", 15, 120.00, 8, 199.90, "Eletrodoméstico");
        Produto pr4 = new Produto("Livro Java para Iniciantes", 100, 20.00, 40, 49.90, "Livro");
        Produto pr5 = new Produto("Smartphone Samsung", 8, 1200.00, 3, 1800.00, "Eletrônico");
        
        estoque.adcionarProd(1, pr1);
        estoque.adcionarProd(2, pr2);
        estoque.adcionarProd(3, pr3);
        estoque.adcionarProd(4, pr4);
        estoque.adcionarProd(5, pr5);
        
        estoque.verProd(1);
        
        estoque.reltorioProd();
        
        estoque.relatorioCompleto(1);
    }
}
