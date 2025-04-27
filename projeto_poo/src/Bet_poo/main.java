/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bet_poo;

/**
 *
 * @author samuel
 */
public class main {
    public static void main(String[] args) {
        Jogador jg01 = new Jogador();
        
        jg01.main(args);
        
        InOut.MsgDeAviso("jogador", jg01.credito.saldo.toString());
    }
}
