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
public class Aposta {
    int idAposta;
    Double valorAposta;
    int quantidade;
    List<Jogo> jogos = new ArrayList(10);
    
    public Aposta(Double valor, int quant) {
        this.valorAposta = valor;
        this.quantidade = quant;
        this.jogos = jogos;
    }
    
    public void adcionarJogo(Jogo jogo) {
        jogos.add(jogo);
    }
    
    public void visualizarJogos() {
        jogos.forEach(jogo -> InOut.MsgDeAviso("Jogo", jogo.toString()));
    }
    public void atualizarJogos(Double valor, int quant) {
        this.valorAposta = valor;
        this.quantidade = quant;
    }
    public void deletarJogo(Jogo jogo) {
        jogos.remove(jogo);
    }
}
