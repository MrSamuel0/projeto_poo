/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_poo;
import java.util.*;
/**
 *
 * @author samuel
 */
public class Imovel {
    String matricula;
    String nome;
    Float imposto;
    int meses_atraso;
    
    public void Imovel(String matricula, String nome, int meses, Float imposto) {
        this.matricula = matricula;
        this.nome = nome;
        this.meses_atraso = meses;
        this.imposto = imposto;
    }
}
