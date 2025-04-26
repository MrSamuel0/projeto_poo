/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bet_poo;

/**
 *
 * @author samuel
 */
public class Credito {
    Double saldo;
    String validade;
    String moeda;
    Boolean bloqueado;
    
    public Credito(Double saldo, String validade, String moeda, Boolean bloqueado) {
        this.saldo = saldo;
        this.validade = validade;
        this.moeda = moeda;
        this.bloqueado = bloqueado;
    }
    
}
