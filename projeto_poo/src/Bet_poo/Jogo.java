/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bet_poo;

/**
 *
 * @author samuel
 */
public class Jogo {
    int idJogo;
    String descritivo;
    Double apostaMax;
    Double apostaMin;

    public Jogo(int idJogo, String descritivo, Double apostaMax, Double apostaMin) {
        this.idJogo = idJogo;
        this.descritivo = descritivo;
        this.apostaMax = apostaMax;
        this.apostaMin = apostaMin;
    }
    
}
