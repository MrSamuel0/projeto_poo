/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bet_poo;
import java.util.*;

/**
 *
 * @author samuel
 */
public class Jogador {
    int idJogador;
    String nome;
    String sobrenome;
    String apelido;
    String cpf;
    String nacionalidade;
    Date dataNascimento;
    Credito credito;
    List<Aposta> apostas = new ArrayList(10);
    
    public void criarAposta(Aposta aposta) {
        apostas.add(aposta);
    }
    
    public void main(String[] args) {
        
    }
    
    public void menu() {
        apostas.forEach(aposta -> {
            
        })
    }
}
