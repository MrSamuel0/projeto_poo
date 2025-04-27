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
        Credito creditoJogador = new Credito(300.00, "1 mes", "Real",false);
        this.credito = creditoJogador;
        
        Jogo jogo1 = new Jogo(1, "Futebol - Final", 500.0, 10.0);
        Jogo jogo2 = new Jogo(2, "Basquete - Semi-final", 400.0, 20.0);
        Jogo jogo3 = new Jogo(3, "Tênis - Aberto", 300.0, 15.0);
        Jogo jogo4 = new Jogo(4, "Corrida de Cavalos", 600.0, 25.0);
        Jogo jogo5 = new Jogo(5, "Boxe - Campeonato", 450.0, 30.0);
        
        Aposta aposta1 = new Aposta(100.0, 4);
        
        aposta1.adcionarJogo(jogo1);
        aposta1.adcionarJogo(jogo2);
        aposta1.adcionarJogo(jogo3);
        aposta1.adcionarJogo(jogo4);
        aposta1.adcionarJogo(jogo5);
  
        this.criarAposta(aposta1);
        
        this.menu();
    }
    
    public void menu() {
        Double totalApostas = 0.00;
        
        for (Aposta aposta : apostas) {
            totalApostas += aposta.valorAposta * aposta.quantidade;
            
        }
        
        if (totalApostas > this.credito.saldo) {
            InOut.MsgDeAviso("Saldo insuficiente", "Seu saldo e: " + this.credito.saldo);
        }
        
        this.credito.saldo -= totalApostas;
    }
}
